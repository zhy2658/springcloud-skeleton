package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;

@Data
@AllArgsConstructor
public class BorrowDetail {

    private User user;

    private List<Book> bookList;

}
