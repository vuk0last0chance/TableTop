package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.tabletop.helpers.SceneSwitcher;

public class ItemCreatorProfiVerzijaController {

    @FXML
    private Button cancelItemCreationButton;

    @FXML
    private Button itemCreateButton;

    @FXML
    private TextField itemDescriptionTextField;

    @FXML
    private TextField itemNameTextField;

    @FXML
    void cancelItemCreationButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void itemCreateButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void itemDescriptionTextFieldEntered(ActionEvent event) {

    }

    @FXML
    void itemNameTextFieldEntered(ActionEvent event) {

    }

}
