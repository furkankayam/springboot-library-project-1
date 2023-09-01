package com.bmk;

import com.bmk.dto.request.BookRequest;
import com.bmk.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLibraryProject1Application implements CommandLineRunner {

	private final BookService bookService;

	public SpringbootLibraryProject1Application(BookService bookService) {
		this.bookService = bookService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLibraryProject1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BookRequest bookRequest = new BookRequest("Beyaz Zambaklar Ulkesi","Grigory Petrov",140);
		bookService.createBook(bookRequest);
	}
}
