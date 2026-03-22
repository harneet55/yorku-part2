package com.yorku.gui;
import com.yorku.coordinator.HeadLabCoordinator;
import com.yorku.coordinator.LabManager;
import com.yorku.users.User;
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
    private LabManager labManager; // reference to LabManager system

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

        Button loginBtn = new Button("Login");

        loginBtn.setOnAction(e -> {
            try {
               String type = userType.getValue();
                String email = emailField.getText();
                String password = passwordField.getText();
                String id = idField.getText();

                // 1️⃣ Check that email is entered
                if (email == null || email.trim().isEmpty()) {
                    new Alert(Alert.AlertType.ERROR, "Email is required").show();
                    return;
                }
                if (password == null || password.trim().isEmpty()) {
                    new Alert(Alert.AlertType.ERROR, "password is required").show();
                    return;
                }
                if (id == null || id.trim().isEmpty()) {
                    new Alert(Alert.AlertType.ERROR, "id is required").show();
                    return;
                }

                // 2️⃣ Check that user type is selected
                if (type == null) {
                    new Alert(Alert.AlertType.ERROR, "Select a user type").show();
                    return;
                }

                if (type.equals("head coordinator") && email.equals("Alice@yorku.ca")) {
                    HeadCoordinatorApprovalScreen approvalScreen =
                            new HeadCoordinatorApprovalScreen(stage, HeadLabCoordinator.getInstance(),this);
                    approvalScreen.show();

                } else if (type.equals("lab_manager")) {
                    LabManagerScreen labScreen = new LabManagerScreen(stage, labManager, this);
                    labScreen.show();

                } else {
                    User user = UserFactory.createUser(
                            type,
                            emailField.getText(),
                            passwordField.getText(),
                            idField.getText()
                    );

                    ReservationScreen reservation = new ReservationScreen(stage, user, labManager, this);
                    reservation.show();
                }

            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, "Invalid login or missing information").show();
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(title, emailField, passwordField, idField, userType, loginBtn);
        layout.setStyle("-fx-padding: 15;");

        stage.setScene(new Scene(layout, 400, 300));
        stage.setTitle("Login");
        stage.show();
    }
}