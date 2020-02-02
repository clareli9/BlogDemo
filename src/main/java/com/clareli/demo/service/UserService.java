package com.clareli.demo.service;

import com.clareli.demo.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
