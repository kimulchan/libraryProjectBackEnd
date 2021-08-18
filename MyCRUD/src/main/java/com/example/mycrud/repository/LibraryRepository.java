package com.example.mycrud.repository;

import com.example.mycrud.domain.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
