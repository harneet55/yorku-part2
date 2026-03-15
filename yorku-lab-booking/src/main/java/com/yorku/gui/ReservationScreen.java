package com.yorku.gui;

import com.yorku.booking.BookingFacade;
import com.yorku.coordinator.LabManager;
import com.yorku.equipment.Equipment;
import com.yorku.users.User;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReservationScreen {

    private Stage stage;
    private User user;
    private LabManager labManager;
    private LoginScreen loginScreen; // reference for back button

    public ReservationScreen(Stage stage, User user, LabManager labManager, LoginScreen loginScreen) {
        this.stage = stage;
        this.user = user;
        this.labManager = labManager;
        this.loginScreen = loginScreen;
    }

    public void show() {

        Label title = new Label("Reserve Equipment");

        ComboBox<String> equipmentList = new ComboBox<>();
        for (Equipment eq : labManager.getAvailableEquipment()) {
            if (eq.isAvailable()) {
                equipmentList.getItems().add(eq.getId() + " - " + eq.getDescription());
            }
        }

        TextField hoursField = new TextField();
        hoursField.setPromptText("Hours");

        Button reserveBtn = new Button("Reserve");
        reserveBtn.setOnAction(e -> {
        try {
        String selected = equipmentList.getValue();
        if (selected == null) {
            new Alert(Alert.AlertType.ERROR, "Select equipment").show();
            return;
        }

        String eqId = selected.split(" - ")[0];          // Extract ID
        Equipment eq = labManager.getEquipmentById(eqId); // Get object

        int hours = Integer.parseInt(hoursField.getText());

        BookingFacade booking = new BookingFacade();
        booking.reserveEquipment(user, eq, hours);

        new Alert(Alert.AlertType.INFORMATION, "Reservation successful!").show();

        } catch (Exception ex) {
        new Alert(Alert.AlertType.ERROR, "Reservation failed").show();
        }
    });

        Button backBtn = new Button("Back");
        backBtn.setOnAction(e -> loginScreen.show());

        VBox layout = new VBox(10, title, equipmentList, hoursField, reserveBtn, backBtn);
        layout.setStyle("-fx-padding: 15;");

        stage.setScene(new Scene(layout, 400, 300));
        stage.show();
    }
}