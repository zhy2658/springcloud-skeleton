package com.example.service.client;

import com.example.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "bookservice",fallback = BookFallbackClient.class)
public interface BookClient {

    @RequestMapping("/book/{bid}")
    Book getBook(@PathVariable int bid);
    


}
