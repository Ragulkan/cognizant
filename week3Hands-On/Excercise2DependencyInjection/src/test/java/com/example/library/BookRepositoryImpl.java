package com.example.library.repository;

import com.example.library.model.Book;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BookRepositoryImpl implements BookRepository {
    private final Map<Long, Book> store = new ConcurrentHashMap<>();

    @Override
    public Book findById(Long id) {
        return store.get(id);
    }

    @Override
    public void save(Book book) {
        store.put(book.getId(), book);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(store.values());
    }
}
