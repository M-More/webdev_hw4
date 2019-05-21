package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByName(String userName);
}

