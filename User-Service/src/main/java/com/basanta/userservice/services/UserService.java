package com.basanta.userservice.services;

import com.basanta.userservice.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User getUser(Long Id);

    List<User> getAllUser();
}
