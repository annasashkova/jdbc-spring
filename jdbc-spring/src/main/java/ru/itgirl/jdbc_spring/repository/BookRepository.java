package ru.itgirl.jdbc_spring.repository;

import ru.itgirl.jdbc_spring.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    List<Book> findBookById(Long id);
}
