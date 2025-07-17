package com.shopsphere.userservice.service;

import com.shopsphere.userservice.dto.UserDto;
import com.shopsphere.userservice.entity.UserEntity;
import com.shopsphere.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Convert UserEntity to UserDto
    private UserDto toDto(UserEntity user) {
        return new UserDto(user.getId(), user.getUsername(), user.getEmail());
    }

    // Convert UserDto to UserEntity (for create/update)
    private UserEntity toEntity(UserDto dto) {
        UserEntity user = new UserEntity();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        return user;
    }

    public UserDto createUser(UserDto dto) {
        UserEntity user = toEntity(dto);
        UserEntity saved = userRepository.save(user);
        return toDto(saved);
    }

    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Optional<UserDto> getUserById(Long id) {
        return userRepository.findById(id)
                .map(this::toDto);
    }

    public Optional<UserDto> updateUser(Long id, UserDto dto) {
        return userRepository.findById(id).map(existing -> {
            existing.setUsername(dto.getUsername());
            existing.setEmail(dto.getEmail());
            UserEntity updated = userRepository.save(existing);
            return toDto(updated);
        });
    }

    public boolean deleteUser(Long id) {
        return userRepository.findById(id).map(user -> {
            userRepository.delete(user);
            return true;
        }).orElse(false);
    }
}
