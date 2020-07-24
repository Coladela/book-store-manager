package com.coladela.bookstoremanager.bookstoremanager.repository;

import com.coladela.bookstoremanager.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
