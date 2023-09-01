package com.bmk.controller;

import com.bmk.dto.request.BookRequest;
import com.bmk.dto.response.BookResponse;
import com.bmk.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    //LIST
    //http://localhost:8080/api/books
    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBook() {
        return new ResponseEntity<>(bookService.getAllBook(), HttpStatus.OK);
    }

    //CREATE
    //http://localhost:8080/api/books
    @PostMapping
    public ResponseEntity<BookResponse> createBook(@RequestBody BookRequest bookRequest) {
        return new ResponseEntity<>(bookService.createBook(bookRequest), HttpStatus.CREATED);
    }

    //UPDATE
    //http://localhost:8080/api/books/{name}
    @PutMapping("/update/{name}")
    public ResponseEntity<BookResponse> updateBook(@PathVariable String name,
                                                   @RequestBody BookRequest bookRequest) {
        return new ResponseEntity<>(bookService.updateBook(name, bookRequest), HttpStatus.OK);
    }

    //DELETE
    //http://localhost:8080/api/books/{name}
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<Map<String, Boolean>> deleteBook(@PathVariable String name) {
        return new ResponseEntity<>(bookService.deleteBook(name), HttpStatus.OK);
    }

    //SEARCH
    //http://localhost:8080/api/books/name/{name}
    @GetMapping("/{name}")
    public ResponseEntity<List<BookResponse>> searchBook(@PathVariable String name) {
        return new ResponseEntity<>(bookService.searchBook(name), HttpStatus.OK);
    }
}
