package com.example.service;

import com.example.entity.Book;
import com.example.entity.Borrow;
import com.example.entity.BorrowDetail;
import com.example.entity.User;
import com.example.mapper.BorrowMapper;
import com.example.service.client.BookClient;
import com.example.service.client.UserClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements  BorrowService{

    @Resource
    BorrowMapper borrowMapper;

    @Resource
    BookClient bookClient;

    @Resource
    UserClient userClient;

    @Override
    public BorrowDetail getBorrowDetailByUid(int uid) {
        List<Borrow> borrowList= borrowMapper.getBorrowByUid(uid);

        User user = userClient.getUser(uid);
        System.out.println(user);
        List<Book> bookList= borrowList
                .stream()
                .map( b -> bookClient.getBook(b.getBid()))
                .collect(Collectors.toList());

        return new BorrowDetail(user,bookList);
    }
}
