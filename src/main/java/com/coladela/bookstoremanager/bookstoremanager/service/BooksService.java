package com.coladela.bookstoremanager.bookstoremanager.service;

import com.coladela.bookstoremanager.bookstoremanager.dto.BookDTO;
import com.coladela.bookstoremanager.bookstoremanager.dto.MessageResponseDTO;
import com.coladela.bookstoremanager.bookstoremanager.entity.Book;
import com.coladela.bookstoremanager.bookstoremanager.mapper.BookMapper;
import com.coladela.bookstoremanager.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {

    BookRepository bookRepository;
    private BookMapper bookMapper ;

    @Autowired
    public BooksService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.bookMapper = BookMapper.INSTANCE;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book bookToSave = bookMapper.toModel(bookDTO);
        var savedBook = bookRepository.save(bookToSave);
        return  MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }

}
