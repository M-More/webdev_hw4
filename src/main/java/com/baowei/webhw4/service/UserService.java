package com.baowei.webhw4.service;
import java.util.List;
import com.baowei.webhw4.vo.User;

public interface UserService {
    List<User> findAllUser();

    void createUser(String userName, String userPassword, String userEmail, String userKind, boolean userStatus);

    void updateUser(String userName, String userPassword, String userEmail, String userKind, boolean userStatus);

    void deleteUser(int userId);
}
