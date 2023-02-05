package com.wak.service.impl;

import com.wak.domain.User;
import com.wak.mapper.UserMapper;
import com.wak.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wak
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean checkAccount(String account) {
        return userMapper.selectByAccount(account) != null;
    }

    @Override
    public User login(String account, String password) {
        return userMapper.selectOne(account, password);
    }

    @Override
    public int register(String account, String password) {
        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        return userMapper.insert(user);
    }
}
