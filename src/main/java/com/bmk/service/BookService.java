package com.bmk.service;

import com.bmk.dto.request.BookRequest;
import com.bmk.dto.response.BookResponse;

import java.util.List;
import java.util.Map;

public interface BookService {

    //LIST
    List<BookResponse> getAllBook();

    //SEARCH
    List<BookResponse> searchBook(String name);

    //CREATE
    BookResponse createBook(BookRequest bookRequest);

    //UPDATE
    BookResponse updateBook(String name, BookRequest bookRequest);

    //DELETE
    Map<String, Boolean> deleteBook(String name);

}