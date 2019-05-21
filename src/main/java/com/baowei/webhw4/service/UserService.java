package com.baowei.webhw4.service;
import java.util.List;
import com.baowei.webhw4.entity.User;

import javax.transaction.Transactional;

public interface UserService {
    List<User> findAllUser();

    void createUser(String userName, String userPassword, String userEmail, String userKind, boolean userStatus);

    @Transactional
    void updateUserStatus(boolean userStatus, int userId);

    void deleteUser(int userId);
}
