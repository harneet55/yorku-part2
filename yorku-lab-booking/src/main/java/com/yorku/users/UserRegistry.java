package com.yorku.users;

import java.util.HashMap;
import java.util.Map;

public class UserRegistry {

    private static UserRegistry instance;
    private Map<String, User> usersByEmail = new HashMap<>();

    private UserRegistry() {}

    public static UserRegistry getInstance() {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
    }

    public boolean isEmailRegistered(String email) {
        return usersByEmail.containsKey(email);
    }

    public void registerUser(User user) {
        usersByEmail.put(user.getEmail(), user);
    }

    public User getUserByEmail(String email) {
        return usersByEmail.get(email);
    }
}