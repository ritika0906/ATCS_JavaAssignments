package com.ia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Book;
import com.ia.service.BookService;

@RestController
@RequestMapping("/book")       //http://localhost:7256/book
public class BookController {

	@Autowired
	BookService service;
	
	//post-->insert,get-->get,put-->update,delete->remove
	
	//data inserted--->post ia used so postMapping
	@PostMapping("/addBook")  //http://localhost:7256/book/addBook
	public Book addBook(@RequestBody Book b)
	{		
		return service.addBook(b);
		
	}
	
	@PutMapping("/updateBook")  //http://localhost:7256/book/updateBook
	public Book updateBook(@RequestBody Book b)
	{		
		return service.updateBook(b);
		
	}
	
	@GetMapping("/getBook/{bookId}")  //http://localhost:7256/book/getBook/bid
	public Book getBook(@PathVariable("bookId") int bookId)
	{		
		return service.getBook(bookId);
		
	}
	
	@GetMapping("/getAllBook")  //http://localhost:7256/book/getAllBook
	public List<Book> getAllBook()
	{		
		return service.getAllBook();
		
	}
	
	
	@DeleteMapping("/deleteBook/{bookId}")  //http://localhost:7256/book/deleteBook/bookId-->method url
	public String deleteBook(@PathVariable("bookId") int bookId)
	{		
		return service.deleteBook(bookId);
		
	}
	
}
