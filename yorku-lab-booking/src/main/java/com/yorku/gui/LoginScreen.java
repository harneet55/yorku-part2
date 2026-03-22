package com.yorku.gui;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.yorku.coordinator.HeadLabCoordinator;
import com.yorku.coordinator.LabManager;
import com.yorku.users.PasswordValidator;
import com.yorku.users.User;
import com.yorku.users.User.Status;
import com.yorku.users.UserFactory;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginScreen {

    private Stage stage;
    private LabManager labManager;

    public LoginScreen(Stage stage, LabManager labManager) {
        this.stage = stage;
        this.labManager = labManager;
    }

    public void show() {
        Label title = new Label("YorkU Lab Booking System");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        TextField idField = new TextField();
        idField.setPromptText("Student/Staff ID or Certification");

        ComboBox<String> userType = new ComboBox<>();
        userType.getItems().addAll("student", "faculty", "researcher", "guest", "lab_manager", "head coordinator");
        userType.setPromptText("Select User Type");

        // Sample Users Dropdown
        ComboBox<String> sampleUsers = new ComboBox<>();
        sampleUsers.setPromptText("Load Sample User");

        // Read CSV directly
        List<String[]> users = new ArrayList<>();
        try (InputStream is = getClass().getResourceAsStream("/com/yorku/sample_users.csv")) {
            if (is == null) throw new Exception("sample_users.csv not found in resources");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                String line;
                br.readLine(); // skip header
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",", -1);
                    users.add(parts);
                    sampleUsers.getItems().add(parts[0]); // add Name as display
                }
            }

            // Auto-fill fields when a sample user is selected
            sampleUsers.setOnAction(ev -> {
                int index = sampleUsers.getSelectionModel().getSelectedIndex();
                if (index >= 0) {
                    String[] selectedUser = users.get(index);
                    // CSV columns: Name, UserType, Email, Password, ID_Certification
                    userType.setValue(selectedUser[1]);
                    emailField.setText(selectedUser[2]);
                    passwordField.setText(selectedUser[3]);
                    idField.setText(selectedUser[4]);
                }
            });
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Failed to load sample users: " + ex.getMessage()).show();
        }

        Button loginBtn = new Button("Login");
        loginBtn.setOnAction(e -> {
    try {
        String type = userType.getValue();
        String email = emailField.getText();
        String password = passwordField.getText();
        String id = idField.getText();

        // ----------- BASIC VALIDATION -----------
        if (email == null || email.trim().isEmpty()) {
            showError("Email is required");
            return;
        }

        if (password == null || password.trim().isEmpty()) {
            showError("Password is required");
            return;
        }

        if (id == null || id.trim().isEmpty()) {
            showError("ID is required");
            return;
        }

        if (type == null) {
            showError("Select a user type");
            return;
        }

        // ----------- PASSWORD VALIDATION (Requirement 1) -----------
        if (!PasswordValidator.isValid(password)) {
            showError("Password must contain uppercase, lowercase, number, and symbol.");
            return;
        }

        // ----------- HEAD COORDINATOR LOGIN -----------
        if (type.equals("head coordinator")) {
            if (!email.equals("Alice@yorku.ca")) {
                showError("Unauthorized Head Coordinator");
                return;
            }

            HeadCoordinatorApprovalScreen approvalScreen =
                    new HeadCoordinatorApprovalScreen(stage, HeadLabCoordinator.getInstance(), this);
            approvalScreen.show();
            return;
        }

        // ----------- LAB MANAGER LOGIN (RESTRICTED) -----------
        if (type.equals("lab_manager")) {
            // Only allow if already created by Head Coordinator
            LabManagerScreen labScreen = new LabManagerScreen(stage, labManager, this);
            labScreen.show();
            return;
        }

        // ----------- NORMAL USER CREATION (FACTORY PATTERN) -----------
        User user = UserFactory.createUser(type, email, password, id);

        // Assign pending approval if university affiliated
        if (type.equals("student") || type.equals("faculty") || type.equals("researcher")) {
            user.setStatus(Status.PENDING_APPROVAL);
        } else {
            user.setStatus(Status.APPROVED); // guests can skip approval
        }

        // ----------- CHECK APPROVAL STATUS -----------
        if (user.getStatus().equals(Status.PENDING_APPROVAL)) {
            showError("Your account is pending approval by Head Coordinator.");
            return;
        }

        // ----------- SUCCESS → RESERVATION SCREEN -----------
        ReservationScreen reservation = new ReservationScreen(stage, user, labManager, this);
        reservation.show();

    } catch (Exception ex) {
        showError("Invalid login or missing information");
    }
});

        VBox layout = new VBox(10);
        layout.getChildren().addAll(title, emailField, passwordField, idField, userType, sampleUsers, loginBtn);
        layout.setStyle("-fx-padding: 15;");

        stage.setScene(new Scene(layout, 400, 350));
        stage.setTitle("Login");
        stage.show();
    }

    private void showError(String message) {
    new Alert(Alert.AlertType.ERROR, message).show();
}
}