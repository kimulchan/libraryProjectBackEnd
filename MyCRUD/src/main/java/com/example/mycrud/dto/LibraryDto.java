package com.example.mycrud.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class LibraryDto {
    private Integer id;
    private String bookName;
    private String libraryName;
    private Timestamp timestamp;
}
