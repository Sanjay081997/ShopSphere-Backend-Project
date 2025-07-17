package com.shopsphere.userservice.service.impl;

import com.shopsphere.userservice.dto.UserRequest;
import com.shopsphere.userservice.entity.User;
import com.shopsphere.userservice.repository.UserRepository;
import com.shopsphere.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequest request) {
        User user = new User(request.getName(), request.getEmail(), request.getPhone());
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
