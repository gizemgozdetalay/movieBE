package com.gizemgozde.kafka.kafkastreamsorderproject.controller;

import com.gizemgozde.kafka.kafkastreamsorderproject.entity.User;
import com.gizemgozde.kafka.kafkastreamsorderproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gizem
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {

        System.out.println("user girdi");
        System.out.println(user.getFirstname());
        return user;
    }


}

