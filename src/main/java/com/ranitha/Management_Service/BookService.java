package com.ranitha.Management_Service;

import java.util.List;

import com.ranitha.Management_DAO.ManagmentDao;
import com.ranitha.Management_DTO.Management;

public class BookService {
	private ManagmentDao bookDao;

    public BookService(ManagmentDao bookDao) {
        this.bookDao = bookDao;
    }

    public Management createBook(Management book) {
       
        return bookDao.create(book);
    }

    public List<Management> getAllBooks() {
        return bookDao.findAll();
    }

    public Management getBookById(Long id) {
        return bookDao.findById(id);
    }

    public Management updateBook(Management book) {
     
        return bookDao.update(book);
    }

    public boolean deleteBook(Long id) {
        return bookDao.delete(id);
    }
}
