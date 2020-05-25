package com.rinpo.blog.service;

import com.rinpo.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
