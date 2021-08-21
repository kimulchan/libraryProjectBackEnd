package com.example.mycrud.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//@JsonIgnoreProperties({"library"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30,nullable = false)
    private String bookname;

    @JoinColumn(name = "libraryId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Library library;

    @CreationTimestamp
    private Timestamp timestamp;
}
