package com.dtdt.DormManager.model;

public class Admin extends User {

    private String staffRole; // e.g., "Front Desk", "Manager"

    public Admin(String userId, String email, String password, String fullName, String staffRole) {
        super(userId, email, password, fullName);
        this.staffRole = staffRole;
    }

    // ... getters/setters for staffRole ...
}