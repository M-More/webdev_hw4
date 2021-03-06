package com.baowei.webhw4.controller;

import java.util.List;

import com.baowei.webhw4.service.UserService;
import com.baowei.webhw4.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showAll")
    public List<User> showAll() {
        List<User> userlist = userService.findAllUser();
        return userlist;
    }

    @RequestMapping("/showNow")
    public UserDetails showNow() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        return userDetails;
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request, @RequestParam("userId") int userId) {
        userService.deleteUser(userId);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request, @RequestParam("userId") int userId,
                        @RequestParam("userStatus") boolean userStatus) {
        userService.updateUserStatus(userStatus, userId);
    }

    @RequestMapping("/create")
    public void create(HttpServletRequest request, @RequestParam("userName") String userName,
                       @RequestParam("userPassword") String userPassword, @RequestParam("userEmail") String userEmail,
                       @RequestParam("userKind") String userKind, @RequestParam("userStatus") boolean userStatus) {
        userService.createUser(userName,userPassword,userEmail,userKind,userStatus);
    }


}
