package org.example.tabletop.helpers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;
import java.util.Stack;

public class SceneSwitcher {
    public static final Stack<String> sceneHistory = new Stack<>();

    public static void init(String initialFxml) {
        sceneHistory.clear();
        sceneHistory.push(initialFxml);
    }
    public static void quitInstance(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public static void switchScene(ActionEvent event, String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(SceneSwitcher.class.getResource(fxmlFile)));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            sceneHistory.push(fxmlFile);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void goBack(ActionEvent event) {
        if (sceneHistory.size() > 1) {
            sceneHistory.pop();
            String previousFxml = sceneHistory.peek();
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(SceneSwitcher.class.getResource(previousFxml)));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public static void clearHistory() {
        if (sceneHistory.size() > 1) {
            String initial = sceneHistory.firstElement();
            sceneHistory.clear();
            sceneHistory.push(initial);
        }
    }
}
