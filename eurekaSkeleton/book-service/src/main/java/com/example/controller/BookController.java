package com.example.controller;


import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class BookController {

    @Resource
    BookService bookService;


    @RequestMapping("/book/{bid}")
    public Book getBook(@PathVariable int bid,
                        HttpServletRequest request){
        String test=request.getHeader("Test");
        System.out.println(test);
        return bookService.getBookById(bid);
    }

}
