package com.coladela.bookstoremanager.bookstoremanager.mapper;


import com.coladela.bookstoremanager.bookstoremanager.dto.BookDTO;
import com.coladela.bookstoremanager.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    Book toModel(BookDTO bookDto);
    BookDTO toDTO(Book book);
}
