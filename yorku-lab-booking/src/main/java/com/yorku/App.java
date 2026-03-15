package com.yorku;

import javafx.application.Application;
import javafx.stage.Stage;
import com.yorku.gui.LoginScreen;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        LoginScreen login = new LoginScreen(stage);
        login.show();
    }

    public static void main(String[] args) {
        launch();
    }
}