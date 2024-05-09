package com.Portal.JobPortal.Entities;

import com.Portal.JobPortal.Constants.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId ;
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private UserRole userRole;
    private String phoneNumber;
    private String address;

    public User() {
    }

    public User(Long userId, String userName, String password, String email, String firstName, String lastName, UserRole userRole, String phoneNumber, String address) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
