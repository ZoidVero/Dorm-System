package com.dtdt.DormManager.model;

// 'abstract' means you cannot create a direct instance of 'User'
public abstract class User {

    private String userId; // Can be Student ID for tenant
    private String email;
    private String password; // Should be hashed!
    private String fullName;

    // Constructor for the common properties
    public User(String userId, String email, String password, String fullName) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }

    // Getters and Setters for the common properties
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
}