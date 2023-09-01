package com.bmk.service.impl;

import com.bmk.dto.mapper.BookConverter1;
import com.bmk.dto.request.BookRequest;
import com.bmk.dto.response.BookResponse;
import com.bmk.model.Book;
import com.bmk.repository.BookRepository;
import com.bmk.service.BookService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookConverter1 bookConverter1;

    public BookServiceImpl(BookRepository bookRepository, BookConverter1 bookConverter1) {
        this.bookRepository = bookRepository;
        this.bookConverter1 = bookConverter1;
    }


    @Override
    public List<BookResponse> getAllBook() {
        List<Book> list = bookRepository.findAll();
        return list
                .stream()
                .map(bookConverter1::toBookResponse)
                .toList();
    }

    @Override
    public List<BookResponse> searchBook(String name) {
        List<Book> list = bookRepository.searchBookName(name);
        return list
                .stream()
                .map(bookConverter1::toBookResponse)
                .toList();
    }

    @Override
    public BookResponse createBook(BookRequest bookRequest) {
        Book book = bookConverter1.toBook(bookRequest);
        bookRepository.save(book);
        return bookConverter1.toBookResponse(book);
    }

    @Override
    public BookResponse updateBook(String name, BookRequest bookRequest) {
        Book book = isThereBook(name);
        Book book1 = new Book(book.getId()
                ,bookRequest.getName()
                ,bookRequest.getAuthor()
                ,bookRequest.getPage()
                ,book.getCreateDate()
        );
        bookRepository.save(book1);
        return bookConverter1.toBookResponse(book1);
    }

    @Override
    public Map<String, Boolean> deleteBook(String name) {
        Map<String, Boolean> response = new HashMap<>();
        bookRepository.delete(isThereBook(name));
        response.put("Delete: ", Boolean.TRUE);
        return response;
    }

    private Book isThereBook(String name) {
        return bookRepository.findByName(name)
                .orElseThrow(
                        () -> new RuntimeException("Book Not Found Name: " + name)
                );
    }

}
