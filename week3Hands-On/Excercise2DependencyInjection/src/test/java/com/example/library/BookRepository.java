package com.example.library.repository;

import com.example.library.model.Book;
import java.util.List;

public interface BookRepository {
    Book findById(Long id);
    void save(Book book);
    List<Book> findAll();
}
