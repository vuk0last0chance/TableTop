package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import org.example.tabletop.helpers.SceneSwitcher;

public class CustomRuleInstanceEditorProfiVerzijaController {

    @FXML
    private Button cancelNewRuleButton;

    @FXML
    private Button confirmNewRuleButton;

    @FXML
    private TextField effectModifierTextField;

    @FXML
    private MenuButton effectSelectMenu;

    @FXML
    private TextField ruleNameTextField;

    @FXML
    void cancelNewRuleButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void confirmNewRuleButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void effectModifierTextFieldEntered(ActionEvent event) {

    }

    @FXML
    void effectSelectMenuClicked(ActionEvent event) {

    }

    @FXML
    void ruleNameTextFieldEntered(ActionEvent event) {

    }
}
