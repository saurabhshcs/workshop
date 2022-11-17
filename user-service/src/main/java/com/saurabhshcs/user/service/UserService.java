package com.saurabhshcs.user.service;

import com.saurabhshcs.user.domain.User;
import com.saurabhshcs.user.repository.UserRepository;

import javax.annotation.Resource;

public class UserService
{
    @Resource
    private UserRepository userRepository;

    public String createUser(User user)
    {
        return "User has been created successfully.";
    }
}
