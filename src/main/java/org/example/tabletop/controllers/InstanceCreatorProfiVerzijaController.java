package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.example.tabletop.helpers.SceneSwitcher;

public class InstanceCreatorProfiVerzijaController {


    @FXML
    private Button cancelInstanceButton;

    @FXML
    private Button createInstanceButton;

    @FXML
    private TextField instanceNameTextField;

    @FXML
    void cancelInstanceButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void createInstanceButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void instanceNameTextFieldClicked(MouseEvent event) {

    }

    @FXML
    void instanceNameTextFieldEntered(ActionEvent event) {

    }

}
