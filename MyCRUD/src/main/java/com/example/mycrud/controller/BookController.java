package com.example.mycrud.controller;

import com.example.mycrud.domain.model.Book;
import com.example.mycrud.dto.BookDto;
import com.example.mycrud.service.BookRegistration;
import com.example.mycrud.service.LibraryRegistration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BookController {

    private final BookRegistration bookRegistration;

    @PostMapping("book")
    private String gogo(@RequestBody BookDto bookDto){
        return bookRegistration.bookReg(bookDto);
    }
}
