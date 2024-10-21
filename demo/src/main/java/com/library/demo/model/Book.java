package com.library.demo.model;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String title;
	@Column(nullable=false)
	private String author;
	@Column(nullable=false)
	private LocalDate publishedDate;
	@Column(nullable=false)
	private int quantity;
	@Column(nullable=false)
	private String isbn;
	
	 public Book() {}

	 public Book(String title, String author, LocalDate publishedDate, String isbn, int quantity) {
	        this.title = title;
	        this.author = author;
	        this.publishedDate = publishedDate;
	        this.isbn = isbn;
	        this.quantity = quantity;
	 }
}
