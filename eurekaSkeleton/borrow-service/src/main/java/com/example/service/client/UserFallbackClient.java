package com.example.service.client;

import com.example.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackClient implements UserClient{
    @Override
    public User getUser(int uid) {
        User user=new User();
        user.setName("我是替代方案");
        return user;
    }
}
