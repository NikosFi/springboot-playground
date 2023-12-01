package com.dev.springbootplayground.request;

import java.time.LocalDate;

public class UserRequest {
    private String username;
    private String email;
    private String password; // Note: Handle with care, ensure security practices
    private String fullName;
    private LocalDate dob;
    private String country;
    private String subscriptionType;

}

