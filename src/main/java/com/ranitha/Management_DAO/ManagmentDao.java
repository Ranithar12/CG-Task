package com.ranitha.Management_DAO;

import java.util.ArrayList;
import java.util.List;

import com.ranitha.Management_DTO.Management;

public class ManagmentDao {
    private static List<Management> books = new ArrayList<>();
    private static Long nextId = 1L;

    
    public Management create(Management book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }

    
    public List<Management> findAll() {
        return books;
    }

    
    public Management findById(Long id) {
        for (Management book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null; 
    }

   
    public Management update(Management updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(updatedBook.getId())) {
                books.set(i, updatedBook);
                return updatedBook;
            }
        }
        return null; 
    }

    
    public boolean delete(Long id) {
        for (Management book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                return true;
            }
        }
        return false; 
    }
}
