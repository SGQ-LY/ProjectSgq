package com.example.service;


import com.example.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User getUser(User user);
    List<User> getAllUsers();
}
