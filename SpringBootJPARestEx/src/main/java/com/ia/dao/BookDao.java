package com.ia.dao;

import java.util.List;

import com.ia.entity.Book;

public interface BookDao {

	Book addBook(Book book);

	Book updateBook(Book book);

	String deleteBook(int bookId);

	Book getBook(int bookId);

	List<Book> getAllBook();

}
