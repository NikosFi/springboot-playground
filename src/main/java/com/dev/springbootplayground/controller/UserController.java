package com.dev.springbootplayground.controller;


import com.dev.springbootplayground.request.UserRequest;
import com.dev.springbootplayground.response.UserResponse;
import com.dev.springbootplayground.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {


    private final UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/users")
    public void create(@Valid @RequestBody UserRequest request) {
        service.create(request);
    }


}
