package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.reposiory.BookRepository;

public class BookService {
	
	private BookRepository bookRepository;

	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public String getBook(int id) {
		return bookRepository.getBookName(id);
	}

	
}
