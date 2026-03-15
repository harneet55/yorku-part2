package com.yorku.gui;

import com.yorku.coordinator.HeadLabCoordinator;
import com.yorku.users.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HeadCoordinatorApprovalScreen {
    private Stage stage;
    private HeadLabCoordinator coordinator;

    private ObservableList<User> pendingList;

    public HeadCoordinatorApprovalScreen(Stage stage, HeadLabCoordinator coordinator) {
        this.stage = stage;
        this.coordinator = coordinator;
        this.pendingList = FXCollections.observableArrayList(coordinator.getPendingApprovals());
    }

    public void show() {
        Label title = new Label("Pending User Approvals");

        ListView<User> listView = new ListView<>(pendingList);
        listView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(User user, boolean empty) {
                super.updateItem(user, empty);
                if (empty || user == null) {
                    setText(null);
                } else {
                    setText(user.getEmail() + " (" + user.getIdNumber() + ") - Status: " + user.getStatus());
                }
            }
        });

        Button approveBtn = new Button("Approve");
        Button rejectBtn = new Button("Reject");

        approveBtn.setOnAction(e -> {
            User selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                coordinator.approveUser(selected);
                pendingList.remove(selected);
                new Alert(Alert.AlertType.INFORMATION, "User approved!").show();
            }
        });

        rejectBtn.setOnAction(e -> {
            User selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                coordinator.rejectUser(selected);
                pendingList.remove(selected);
                new Alert(Alert.AlertType.INFORMATION, "User rejected!").show();
            }
        });

        HBox buttons = new HBox(10, approveBtn, rejectBtn);
        VBox layout = new VBox(10, title, listView, buttons);
        layout.setStyle("-fx-padding: 15;");

        stage.setScene(new Scene(layout, 450, 400));
        stage.setTitle("Coordinator Approval");
        stage.show();
    }

}
