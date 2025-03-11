package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import org.example.tabletop.helpers.SceneSwitcher;

public class CharacterEditorProfiVerzijaController {

    @FXML
    private Button cancelCharacterEdtior;

    @FXML
    private Label characterNameChosen;

    @FXML
    private MenuButton chooseClassMenu;

    @FXML
    private MenuButton chooseGenderMenu;

    @FXML
    private MenuButton chooseRaceMenu;

    @FXML
    private Button confirmCharacterEditor;

    @FXML
    private TextField extraInformationTextField;

    @FXML
    private Button minusCHAButton;

    @FXML
    private Button minusENDButton;

    @FXML
    private Button minusINTButton;

    @FXML
    private Button minusSTRButton;

    @FXML
    private Button minusWISButton;

    @FXML
    private Button plusCHAButton;

    @FXML
    private Button plusENDButton;

    @FXML
    private Button plusINTButton;

    @FXML
    private Button plusSTRButton;

    @FXML
    private Button plusWISButton;

    @FXML
    private Label pointsLeftLabel;

    @FXML
    void cancelCharacterEdtiorClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void chooseClassMenuClicked(ActionEvent event) {

    }

    @FXML
    void chooseGenderMenuClicked(ActionEvent event) {

    }

    @FXML
    void chooseRaceMenuClicked(ActionEvent event) {

    }

    @FXML
    void confirmCharacterEditorClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void extraInformationTextFieldEntered(ActionEvent event) {

    }

    @FXML
    void minusCHAButtonClicked(ActionEvent event) {

    }

    @FXML
    void minusENDButtonClicked(ActionEvent event) {

    }

    @FXML
    void minusINTButtonClicked(ActionEvent event) {

    }

    @FXML
    void minusSTRButtonClicked(ActionEvent event) {

    }

    @FXML
    void minusWISButtonClicked(ActionEvent event) {

    }

    @FXML
    void plusCHAButtonClicked(ActionEvent event) {

    }

    @FXML
    void plusENDButtonClicked(ActionEvent event) {

    }

    @FXML
    void plusINTButtonClicked(ActionEvent event) {

    }

    @FXML
    void plusSTRButtonClicked(ActionEvent event) {

    }

    @FXML
    void plusWISButtonClicked(ActionEvent event) {

    }


}
