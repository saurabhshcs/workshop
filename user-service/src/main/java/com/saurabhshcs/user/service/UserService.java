package com.saurabhshcs.user.service;

import com.saurabhshcs.user.domain.User;
import com.saurabhshcs.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService
{
    @Resource
    private UserRepository userRepository;

    public String createUser(User user)
    {
        return "User has been created successfully.";
    }
}
