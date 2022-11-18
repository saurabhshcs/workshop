package com.saurabhshcs.user.controller;

import com.saurabhshcs.user.domain.User;
import com.saurabhshcs.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/getuser")
    public String getUser(){
        final String name = "saurabh";
        log.info("Returning User:{}", name);
        return name;

    }
}
