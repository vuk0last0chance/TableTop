package org.example.tabletop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.tabletop.helpers.SceneSwitcher;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String initialFxml = "/org/example/tabletop/TableTopMeniProfiVerzija.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(initialFxml));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("TableTop");
        primaryStage.show();
        SceneSwitcher.init(initialFxml);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
