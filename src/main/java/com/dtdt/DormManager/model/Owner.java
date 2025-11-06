package com.dtdt.DormManager.model;

public class Owner extends User {

    // Owners might not need any extra properties,
    // their 'Owner' type is all that matters.
    public Owner(String userId, String email, String password, String fullName) {
        super(userId, email, password, fullName);
    }
}