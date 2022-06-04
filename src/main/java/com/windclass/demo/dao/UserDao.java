package com.windclass.demo.dao;

import com.windclass.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserDao extends JpaRepository<User, String> {
    User getById(String id);

    User findByPassword(String password);

    User getByNameAndPassword(String username, String password);
}