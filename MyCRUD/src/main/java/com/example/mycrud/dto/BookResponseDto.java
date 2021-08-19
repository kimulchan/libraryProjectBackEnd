package com.example.mycrud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponseDto {
    private Integer id;
    private String name;
    private Timestamp timestamp;
}
