package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Dependency injection via setter
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        // populate sample data
        bookRepository.save(new Book(1L, "The Hitchhiker's Guide"));
        bookRepository.save(new Book(2L, "1984"));

        List<Book> books = bookRepository.findAll();
        books.forEach(b -> System.out.println(b.getId() + ": " + b.getTitle()));
    }
}
