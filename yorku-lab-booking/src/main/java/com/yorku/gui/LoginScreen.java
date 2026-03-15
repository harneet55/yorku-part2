package com.yorku.gui;

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

    public LoginScreen(Stage stage) {
        this.stage = stage;
    }

    public void show() {

        Label title = new Label("YorkU Lab Booking System");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        ComboBox<String> userType = new ComboBox<>();
        userType.getItems().addAll("student", "faculty", "researcher", "guest");
        userType.setPromptText("Select User Type");

        Button loginBtn = new Button("Login");

        loginBtn.setOnAction(e -> {

            try {

                User user = UserFactory.createUser(
                        userType.getValue(),
                        emailField.getText(),
                        passwordField.getText(),
                        "ID001"
                );

                ReservationScreen reservation = new ReservationScreen(stage, user);
                reservation.show();

            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, "Invalid login").show();
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(title, emailField, passwordField, userType, loginBtn);

        stage.setScene(new Scene(layout, 400, 250));
        stage.setTitle("Login");
        stage.show();
    }
}