package com.example.demo.userdo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.UserDao;
@Component
public interface UserDaoOps extends JpaRepository<UserDao,Integer> {

}
