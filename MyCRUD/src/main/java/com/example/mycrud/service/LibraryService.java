package com.example.mycrud.service;

import com.example.mycrud.domain.model.Library;
import com.example.mycrud.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    public String libraryReg(Library library) {
        libraryRepository.save(library);
        return "success";
    }
}
