package com.example.mycrud.repository;

import com.example.mycrud.domain.model.Book;
import com.example.mycrud.domain.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByLibrary(Library library);
}
