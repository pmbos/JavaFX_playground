package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginScreen {
    @FXML
    TextField usernameTextField;

    private Parent root;

    public void login (ActionEvent event) {
        //Extract data
        String username = usernameTextField.getText();
        //Preload the screen
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/logged_in_screen.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Use the preloaded controller to populate the screen with cross-controller data
        LoggedInScreen loggedInScreenController = loader.getController();
        loggedInScreenController.displayName(username);

        //Render the scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
