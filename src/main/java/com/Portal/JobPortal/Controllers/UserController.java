package com.Portal.JobPortal.Controllers;

import com.Portal.JobPortal.Constants.UserRole;
import com.Portal.JobPortal.Entities.User;
import com.Portal.JobPortal.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser(){
        return this.userService.getAllUsers();
    }
}
