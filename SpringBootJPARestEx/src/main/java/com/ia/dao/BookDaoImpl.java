package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ia.entity.Book;

@Repository
public class BookDaoImpl implements BookDao {

	@PersistenceContext
	EntityManager entity;
	
	@Override
	public Book addBook(Book book) {
		entity.persist(book);
		return entity.find(Book.class, book.getBookId());
	}

	@Override
	public Book updateBook(Book book) {
		
		return entity.merge(book);
	}

	@Override
	public String deleteBook(int bookId) {
		Book book = entity.find(Book.class, bookId);
		
		if(book!=null)
		{
			entity.remove(book);
			return "book deleted";
		}
		else {
			return "no book found";
		}
	}

	@Override
	public Book getBook(int bookId) {
	
		return entity.find(Book.class, bookId);
	}

	@Override
	public List<Book> getAllBook() {
		TypedQuery<Book> result = entity.createQuery("select e from Book e", Book.class);
		return result.getResultList();
	}

}
