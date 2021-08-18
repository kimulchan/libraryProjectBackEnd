package com.example.mycrud.service;

import com.example.mycrud.domain.model.Book;
import com.example.mycrud.dto.BookDto;
import com.example.mycrud.repository.BookRepository;
import com.example.mycrud.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {

    private final LibraryRepository libraryRepository;
    private final BookRepository bookRepository;

    public String bookReg(BookDto bookDto){
        bookRepository.save(Book.builder()
                        .name(bookDto.getName())
                        .library(libraryRepository.getById(bookDto.getLibraryId()))
                        .build());
        return "success";
    }

}
