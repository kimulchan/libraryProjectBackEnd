package com.example.mycrud.controller;

import com.example.mycrud.domain.model.Book;
import com.example.mycrud.dto.BookDto;
import com.example.mycrud.dto.BookResponseDto;
import com.example.mycrud.dto.ModifyBookDto;
import com.example.mycrud.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookController {

    private final BookService bookService;

    @PostMapping("book")
    private String gogo(@RequestBody BookDto bookDto){
        return bookService.bookReg(bookDto);
    }

    @GetMapping("book")
    public List<Book> getBook(){
        return bookService.bookFind();
    }

    @GetMapping("book/{id}")
    public List<BookResponseDto> getBookId(@PathVariable Integer id){
        return bookService.bookIdFind(id);
    }
    @Transactional
    @PutMapping("book")
    public Book ModifyBook(@RequestBody ModifyBookDto requestModifyBook){
        return bookService.bookModify(requestModifyBook);
    }
}




