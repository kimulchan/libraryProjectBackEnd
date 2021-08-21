package com.example.mycrud.service;

import com.example.mycrud.domain.model.Book;
import com.example.mycrud.dto.BookDto;
import com.example.mycrud.dto.BookResponseDto;
import com.example.mycrud.dto.ModifyBookDto;
import com.example.mycrud.repository.BookRepository;
import com.example.mycrud.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookService {

    private final LibraryRepository libraryRepository;
    private final BookRepository bookRepository;

    public String bookReg(BookDto bookDto){
        bookRepository.save(Book.builder()
                        .bookname(bookDto.getBookName())
                        .library(libraryRepository.getById(bookDto.getLibraryId()))
                        .build());
        return "success";
    }
    public List<Book> bookFind(){
        return bookRepository.findAll();
    }


    public List<Book> show(Integer id) {
        List<Book> books = libraryRepository.findById(id)
                .map(bookRepository::findByLibrary)
                .orElseThrow(()->new IllegalArgumentException(("해당 도서관은 존재하지 않음")));
        return books;
    }

    public List<BookResponseDto> bookIdFind(Integer id) {
        List<BookResponseDto> book = show(id)
                .stream()
                .map(book1 -> new BookResponseDto(book1.getId(), book1.getBookname(), book1.getTimestamp()))
                .collect(Collectors.toList());
        return book;
    }
    public Book bookModify (ModifyBookDto modifyBookDto){
        Book book=bookRepository.findById(modifyBookDto.getBookId()).orElseThrow(()->new IllegalArgumentException("해당 책이 존재하지 않습니다"));
        book.setLibrary(libraryRepository.getById(modifyBookDto.getLibId()));

        return book;
    }

//    public List<Book> bookIdFind(Integer id) {
//        List<Book> books = libraryRepository.findById(id)
//                .map(bookRepository::findByLibrary)
//                .orElseThrow(() -> new IllegalArgumentException("해당 도서관이 존재하지 않습니다."));
//        return books;
//    }

}
