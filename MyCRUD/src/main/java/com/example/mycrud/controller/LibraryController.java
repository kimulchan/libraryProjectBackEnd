package com.example.mycrud.controller;

import com.example.mycrud.domain.model.Library;
import com.example.mycrud.service.LibraryRegistration;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @Autowired
    LibraryRegistration libraryRegistration;

    @PostMapping("library")
    public String libraryPost(@RequestBody Library library){
        return libraryRegistration.김의찬(library);
    }

}
