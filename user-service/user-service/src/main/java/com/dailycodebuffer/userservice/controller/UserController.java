package com.dailycodebuffer.userservice.controller;

import com.dailycodebuffer.userservice.VO.ResponseTemplate;
import com.dailycodebuffer.userservice.entity.User;
import com.dailycodebuffer.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save-user")
    public User saveUser(@RequestBody  User user){
        log.info("Inside  saveUser of user controller");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId){

        return userService.getUserWithDepartment(userId);

    }
}
