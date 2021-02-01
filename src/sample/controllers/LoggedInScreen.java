package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoggedInScreen {
    @FXML
    Label helloLabel;

    public void displayName (String username) {
        helloLabel.setText("Hello: " + username);
    }
}
