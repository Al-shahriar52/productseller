package com.example.productseller.service;

import com.example.productseller.model.Book;

import java.util.List;
public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
