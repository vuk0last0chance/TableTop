package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.tabletop.helpers.SceneSwitcher;

public class CharacterCreatorProfiVerzijaController {

    @FXML
    private Button cancelCharacterButton;

    @FXML
    private TextField characterNameInputField;

    @FXML
    private Button createCharacterButton;

    @FXML
    void cancelCharacterButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void characterNameInputFieldEntered(ActionEvent event) {

    }

    @FXML
    void createCharacterButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

}
