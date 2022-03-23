package com.ia.service;

import java.util.List;

import com.ia.entity.Book;

public interface BookService {

	Book addBook(Book book);

	Book updateBook(Book book);

	String deleteBook(int bookId);

	Book getBook(int bookId);

	List<Book> getAllBook();

}
