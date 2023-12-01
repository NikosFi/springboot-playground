package com.dev.springbootplayground.response;

import java.time.LocalDate;

public class UserResponse {

    private String id; // Exposing the ID is usually fine for read operations
    private String username;
    private String email; // Depending on your privacy policy
    private String fullName;
    private LocalDate dob;
    private String country;
    private String subscriptionType;

}

