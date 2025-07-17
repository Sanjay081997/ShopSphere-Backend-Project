package com.shopsphere.userservice.service;

import com.shopsphere.userservice.dto.UserRequest;
import com.shopsphere.userservice.entity.User;

import java.util.List;

public interface UserService {
    User createUser(UserRequest request);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
