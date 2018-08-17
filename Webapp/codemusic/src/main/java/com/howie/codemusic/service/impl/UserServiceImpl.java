package com.howie.codemusic.service.impl;

import com.howie.codemusic.dto.User;
import com.howie.codemusic.mapper.UserMapper;
import com.howie.codemusic.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper ;

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

}
