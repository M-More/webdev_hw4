package com.baowei.webhw4.repository;

import com.baowei.webhw4.vo.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserRepo extends JpaRepository<SystemUser,Integer> {
    SystemUser findByUserName(String userName);
}

