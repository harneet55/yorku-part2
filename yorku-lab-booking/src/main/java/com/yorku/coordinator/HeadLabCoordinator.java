package com.yorku.coordinator;

import java.util.ArrayList;
import java.util.List;

import com.yorku.users.PasswordValidator;
import com.yorku.users.User;
import com.yorku.users.UserRegistry;

public class HeadLabCoordinator {

    private static HeadLabCoordinator instance;
    private List<User> pendingApprovals = new ArrayList<>();

    private HeadLabCoordinator() {}

    public static HeadLabCoordinator getInstance() {
        if (instance == null) {
            instance = new HeadLabCoordinator();
        }
        return instance;
    }

    // Generate LabManager
    public LabManager generateLabManager(String name) {
        System.out.println("Lab manager account created for: " + name);
        return new LabManager(name);
    }

    // Register a user (adds to registry and handles pending approval)
    public boolean registerUser(User user) throws Exception {
        UserRegistry registry = UserRegistry.getInstance();

        // Validate email uniqueness
        if (registry.isEmailRegistered(user.getEmail())) {
            throw new Exception("Email already registered");
        }

        // Validate strong password
        if (!PasswordValidator.isValid(user.getPassword())) {
            throw new Exception("Weak password. Must include uppercase, lowercase, number, symbol.");
        }

        // ID / Certification required
        if (user.getIdNumber() == null || user.getIdNumber().isEmpty()) {
            throw new Exception("ID / Certification required");
        }

        // University-affiliated users require approval
        if (user.isUniversityAffiliated()) {
            user.setStatus(User.Status.PENDING_APPROVAL);
            pendingApprovals.add(user);
            System.out.println("User registration pending approval: " + user.getEmail());
        } else {
            user.setStatus(User.Status.APPROVED);
        }

        registry.registerUser(user);
        return true;
    }

    // Approve a pending user
    public void approveUser(User user) {
        if (pendingApprovals.remove(user)) {
            user.setStatus(User.Status.APPROVED);
            System.out.println("User approved: " + user.getEmail());
        }
    }

    // Reject a pending user
    public void rejectUser(User user) {
        if (pendingApprovals.remove(user)) {
            user.setStatus(User.Status.REJECTED);
            System.out.println("User rejected: " + user.getEmail());
        }
    }

    // Optional: get list of pending approvals
    public List<User> getPendingApprovals() {
        return new ArrayList<>(pendingApprovals);
    }
}