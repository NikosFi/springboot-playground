package com.dev.springbootplayground.entity;

import com.dev.springbootplayground.core.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends AbstractEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "country")
    private String country;

    @Column(name = "subscriptionType")
    private String subscriptionType;

    @Column(name = "lastLogin")
    private String lastLogin;

    //private List<Role> roles = new ArrayList<>();

}
