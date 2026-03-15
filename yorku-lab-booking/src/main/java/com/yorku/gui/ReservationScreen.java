package com.yorku.gui;

import com.yorku.booking.BookingFacade;
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

    public ReservationScreen(Stage stage, User user) {
        this.stage = stage;
        this.user = user;
    }

    public void show() {

        Label title = new Label("Reserve Equipment");

        ComboBox<String> equipmentList = new ComboBox<>();
        equipmentList.getItems().addAll(
                "Microscope",
                "Spectrometer",
                "3D Printer"
        );

        TextField hoursField = new TextField();
        hoursField.setPromptText("Hours");

        Button reserveBtn = new Button("Reserve");

        reserveBtn.setOnAction(e -> {

            try {

                Equipment equipment = new Equipment(
                        "EQ001",
                        equipmentList.getValue(),
                        "Lab A"
                );

                int hours = Integer.parseInt(hoursField.getText());

                BookingFacade booking = new BookingFacade();
                booking.reserveEquipment(user, equipment, hours);

                new Alert(Alert.AlertType.INFORMATION,
                        "Reservation successful!"
                ).show();

            } catch (Exception ex) {

                new Alert(Alert.AlertType.ERROR,
                        "Reservation failed"
                ).show();
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(title, equipmentList, hoursField, reserveBtn);

        stage.setScene(new Scene(layout, 400, 250));
    }
}