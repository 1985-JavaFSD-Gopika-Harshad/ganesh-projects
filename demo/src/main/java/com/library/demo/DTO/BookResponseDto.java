package com.library.demo.DTO;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponseDto {
	private Long id;
    private String title;
    private String author;
    private LocalDate publishedDate;
    private String isbn;
    private int quantity;

}
