package com.example.service.client;

import com.example.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookFallbackClient implements BookClient{
    @Override
    public Book getBook(int bid) {
        Book book= new Book();
        return book;
    }
}
