package com.saurabhshcs.user.controller;

import com.saurabhshcs.user.domain.User;
import com.saurabhshcs.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController
{
    @Resource
    private UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
