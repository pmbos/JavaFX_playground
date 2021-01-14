package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.scenes.Drawing;

/**
 * JavaFX Root Class.
 * @author pmbos
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        root.getChildren().addAll(Drawing.getNodes());

        Image icon = new Image("dog.png");

        primaryStage.setTitle("First JavaFX program!");
        primaryStage.getIcons().add(icon);
        primaryStage.setWidth(700);
        primaryStage.setHeight(700);
//        primaryStage.setFullScreen(true);
//        primaryStage.setFullScreenExitHint("YOU CAN'T ESCAPE, UNLESS YOU PRESS Q!");
//        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        Parent fxmlRoot = FXMLLoader.load(getClass().getResource("fxml/SceneSwitch.fxml"));
        Scene scene = new Scene(fxmlRoot);
//        String css = this.getClass().getResource("application.css").toExternalForm();
//        scene.getStylesheets().add(css);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
