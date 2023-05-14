package com.example.controller;


import com.example.entity.Borrow;
import com.example.entity.BorrowDetail;
import com.example.service.BorrowService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class BorrowController {

    @Resource
    BorrowService borrowService;

//    @HystrixCommand(fallbackMethod = "onError")
    @RequestMapping("/borrow/{id}")
    public BorrowDetail getBorrow(@PathVariable Integer id){

        BorrowDetail borrowDetail = borrowService.getBorrowDetailByUid(id);

        return borrowDetail;
    }

//    BorrowDetail onError(Integer uid){
//        return new BorrowDetail(null, Collections.emptyList());
//    }


}
