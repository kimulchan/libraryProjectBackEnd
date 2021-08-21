package com.example.mycrud.controller;

import com.example.mycrud.domain.model.Library;
import com.example.mycrud.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @PostMapping("library")
    public String libraryPost(@RequestBody Library library){
        return libraryService.libraryReg(library);
    }

//    @GetMapping("library")
//    public List<Library> getLibrary(){
//        return libraryService.libraryFind();
//    }
}
