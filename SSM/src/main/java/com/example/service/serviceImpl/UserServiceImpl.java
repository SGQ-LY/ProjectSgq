package com.example.service.serviceImpl;


import com.example.bean.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUser();
    }

    @Override
    public User getUser(User user) {
        return userMapper.getUser(user);
    }
}
