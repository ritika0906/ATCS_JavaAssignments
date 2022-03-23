package com.ia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.dao.BookDao;
import com.ia.entity.Book;

@Service
@Transactional
public class BookServiceimpl implements BookService {

	@Autowired
	BookDao dao;
	
	@Override
	public Book addBook(Book book) {
		
		return dao.addBook(book);
	}

	@Override
	public Book updateBook(Book book) {
		
		return dao.updateBook(book);
	}

	@Override
	public String deleteBook(int bookId) {
		return dao.deleteBook(bookId);
	}

	@Override
	public Book getBook(int bookId) {
		
		return dao.getBook(bookId);
	}

	@Override
	public List<Book> getAllBook() {
		
		return dao.getAllBook();
	}

}
