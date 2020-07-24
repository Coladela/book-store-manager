package com.coladela.bookstoremanager.bookstoremanager.service;

import com.coladela.bookstoremanager.bookstoremanager.dto.MessageResponseDTO;
import com.coladela.bookstoremanager.bookstoremanager.entity.Book;
import com.coladela.bookstoremanager.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BooksService {

    BookRepository bookRepository;

    @Autowired
    public BooksService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        var savedBook = bookRepository.save(book);
        return  MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }

}
