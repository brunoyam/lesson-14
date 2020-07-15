package com.brunoyam.testspringweb.dao;

import com.brunoyam.testspringweb.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserDao implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getName()));
        return 1;
    }

    @Override
    public List<User> getUsers() {
        return DB;
    }

    @Override
    public int deleteUser(UUID id) {
        int i = -1;
        for (int j = 0; j < DB.size(); ++j) {
            if (DB.get(j).getId().equals(id)) {
                i = j;
            }
        }
        if (i != -1) {
            DB.remove(i);
        }
        return 1;
    }
}
