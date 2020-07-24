package com.coladela.bookstoremanager.bookstoremanager.controller;

import com.coladela.bookstoremanager.bookstoremanager.dto.MessageResponseDTO;
import com.coladela.bookstoremanager.bookstoremanager.entity.Book;
import com.coladela.bookstoremanager.bookstoremanager.repository.BookRepository;
import com.coladela.bookstoremanager.bookstoremanager.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BooksService booksService;

    @Autowired
    public BookController(BooksService booksService) {
        this.booksService = booksService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
       var savedBook = booksService.create(book);
      return  savedBook;
    }

}
