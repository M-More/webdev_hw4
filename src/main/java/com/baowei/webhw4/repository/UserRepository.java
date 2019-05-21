package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByName(String userName);

    @Modifying
    @Query("update User set user_status=:status where user_id=:id")
    void updateUserStatus(@Param("status") boolean user_status, @Param("id") Integer user_id);
}

