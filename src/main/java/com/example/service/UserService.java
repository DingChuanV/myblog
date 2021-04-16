package com.example.service;

import com.example.po.User;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: YUN
 * \* Date: 2021/4/11
 * \* Time: 11:00
 * \* Description:
 * \
 */

public interface UserService {

    User checkUser(String username, String password);
}
