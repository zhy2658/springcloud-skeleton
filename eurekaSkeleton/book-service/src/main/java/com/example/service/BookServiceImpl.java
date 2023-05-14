package com.example.service;

import com.example.entity.Book;
import com.example.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements  BookService{

    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }
}
