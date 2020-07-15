package com.brunoyam.testspringweb.service;

import com.brunoyam.testspringweb.dao.UserDao;
import com.brunoyam.testspringweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int insertUser(User user) {
        return this.userDao.insertUser(user);
    }

    public List<User> getUsers() {
        return this.userDao.getUsers();
    }

    public int deleteUser(UUID id) {
        return this.userDao.deleteUser(id);
    }
}
