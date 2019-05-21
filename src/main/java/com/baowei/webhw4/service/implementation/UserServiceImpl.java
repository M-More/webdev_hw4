package com.baowei.webhw4.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baowei.webhw4.entity.User;
import com.baowei.webhw4.repository.UserRepository;
import com.baowei.webhw4.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser(){
        return userRepository.findAll();
    }


    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void updateUserStatus(boolean userStatus, int userId){
        userRepository.updateUserStatus(userStatus,userId);
    }

    @Override
    public void createUser(String userName, String userPassword, String userEmail, String userKind, boolean userStatus) {
        User user = new User(userName,userPassword,userEmail,userKind,userStatus);
        userRepository.save(user);
    }
}
