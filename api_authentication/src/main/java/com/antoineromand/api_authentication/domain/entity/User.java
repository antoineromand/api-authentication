package com.antoineromand.api_authentication.domain.entity;

import com.antoineromand.api_authentication.domain.enums.Role;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private Role role;
    private String createdAt;
    private String updatedAt;
    private UserInformation information;

    public User() {
    }

    public User(int id, String username, String password, String email, Role role, String createdAt,
            String updatedAt, UserInformation information) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.information = information;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserInformation getInformation() {
        return information;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setInformation(UserInformation information) {
        this.information = information;
    }

    // for debugging
    @Override
    public String toString() {
        return "User [createdAt=" + createdAt + ", email=" + email + ", id=" + id + ", role="
                + role + ", updatedAt=" + updatedAt + ", username=" + username + "]";
    }
}
