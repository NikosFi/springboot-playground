package com.dev.springbootplayground.service;

import com.dev.springbootplayground.entity.UserEntity;
import com.dev.springbootplayground.mapper.UserMapper;
import com.dev.springbootplayground.repository.UserRepository;
import com.dev.springbootplayground.request.UserRequest;
import com.dev.springbootplayground.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public List<UserResponse> findAll() {
        List<UserEntity> users = repository.findAll();
        return users.stream().map(mapper::userEntityToUserResponse).collect(Collectors.toList());
    }

    public UserResponse getUserByUsername(String username) {
        UserEntity user = repository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        return mapper.userEntityToUserResponse(user);
    }

    public void create(UserRequest userRequest){
        UserEntity user = mapper.userRequestToUserEntity(userRequest);
        repository.save(user);
    }

}
