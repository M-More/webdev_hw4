package com.baowei.webhw4.controller;

import java.util.List;

import com.baowei.webhw4.service.UserService;
import com.baowei.webhw4.vo.User;

import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request, @RequestParam("userId") int userId) {
        userService.deleteUser(userId);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request, @RequestParam("userId") int userId, @RequestParam("userName") String userName,
                       @RequestParam("userPassword") String userPassword, @RequestParam("userEmail") String userEmail,
                       @RequestParam("userKind") String userKind, @RequestParam("userStatus") boolean userStatus) {
        userService.updateUser(userId,userName,userPassword,userEmail,userKind,userStatus);
    }

    @RequestMapping("/create")
    public void create(HttpServletRequest request, @RequestParam("userId") int userId, @RequestParam("userName") String userName,
                       @RequestParam("userPassword") String userPassword, @RequestParam("userEmail") String userEmail,
                       @RequestParam("userKind") String userKind, @RequestParam("userStatus") boolean userStatus) {
        userService.updateUser(userId,userName,userPassword,userEmail,userKind,userStatus);
    }


}
