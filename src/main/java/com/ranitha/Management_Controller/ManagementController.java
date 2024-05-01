package com.ranitha.Management_Controller;

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

import com.ranitha.Management_DTO.Management;
import com.ranitha.Management_Service.BookService;

@RestController
@RequestMapping("/api/books")
public class ManagementController {
	 private BookService bookService;

	    @Autowired
	    public void  BookController(BookService bookService) {
	        this.bookService = bookService;
	    }

	    @PostMapping
	    public Management createBook(@RequestBody Management book) {
	        return bookService.createBook(book);
	    }

	    @GetMapping
	    public List<Management> getAllBooks() {
	        return bookService.getAllBooks();
	    }

	    @GetMapping("/{id}")
	    public Management getBookById(@PathVariable Long id) {
	        return bookService.getBookById(id);
	    }

	    @PutMapping("/{id}")
	    public Management updateBook(@PathVariable Long id, @RequestBody Management book) {
	        book.setId(id);
	        return bookService.updateBook(book);
	    }

	    @DeleteMapping("/{id}")
	    public boolean deleteBook(@PathVariable Long id) {
	        return bookService.deleteBook(id);
	    }
}
