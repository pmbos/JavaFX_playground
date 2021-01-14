package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * A controller capable of switching between two scenes.
 * @author pmbos
 */
public class SceneController {
    private Stage stage;
    private Scene scene;

    public void switchToScene1 (ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("fxml/EventHandling.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToScene2 (ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("fxml/sample.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
