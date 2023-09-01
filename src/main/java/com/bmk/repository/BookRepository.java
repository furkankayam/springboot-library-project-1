package com.bmk.repository;

import com.bmk.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {


    @Query("SELECT b FROM Book b WHERE b.name LIKE %:name% OR b.author LIKE %:name%")
    List<Book> searchBookName(String name);

    Optional<Book> findByName(String name);

}
