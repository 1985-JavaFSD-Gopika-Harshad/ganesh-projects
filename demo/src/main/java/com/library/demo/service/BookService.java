package com.library.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.demo.DTO.BookRequestDto;
import com.library.demo.DTO.BookResponseDto;
import com.library.demo.Repository.BookRepository;
import com.library.demo.model.Book;

@Service
public class BookService {
	 @Autowired
	    private BookRepository bookRepository;

	    public BookResponseDto addBook(BookRequestDto bookRequestDto) {
	        Book book = convertToEntity(bookRequestDto);
	        Book savedBook = bookRepository.save(book);
	        return convertToResponseDto(savedBook);
	    }
	    private Book convertToEntity(BookRequestDto requestDto) {
	        Book book = new Book();
	        book.setTitle(requestDto.getTitle());
	        book.setAuthor(requestDto.getAuthor());
	        book.setPublishedDate(requestDto.getPublishedDate());
	        book.setIsbn(requestDto.getIsbn());
	        book.setQuantity(requestDto.getQuantity());
	        return book;
	    }
	    private BookResponseDto convertToResponseDto(Book book) {
	        BookResponseDto responseDto = new BookResponseDto();
	        responseDto.setId(book.getId());
	        responseDto.setTitle(book.getTitle());
	        responseDto.setAuthor(book.getAuthor());
	        responseDto.setPublishedDate(book.getPublishedDate());
	        responseDto.setIsbn(book.getIsbn());
	        responseDto.setQuantity(book.getQuantity());
	        return responseDto;
	    }

}
