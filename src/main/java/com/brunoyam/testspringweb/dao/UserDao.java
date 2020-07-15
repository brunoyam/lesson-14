package com.brunoyam.testspringweb.dao;

import com.brunoyam.testspringweb.model.User;

import java.util.List;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> getUsers();

    int deleteUser(UUID id);
}
