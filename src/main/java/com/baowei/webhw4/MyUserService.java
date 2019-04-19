package com.baowei.webhw4;

import com.baowei.webhw4.repository.SystemUserRepo;
import com.baowei.webhw4.vo.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserService implements UserDetailsService {

    @Autowired
    private SystemUserRepo systemUserRepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //根据用户名从数据库查询对应记录
        SystemUser user = systemUserRepo.findByUserName(s);
        if (user == null) {
            throw new UsernameNotFoundException("username is not exists");
        }
        System.out.println("username is : " + user.getUsername() + ", password is :" + user.getPassword());
        return user;
    }
}
