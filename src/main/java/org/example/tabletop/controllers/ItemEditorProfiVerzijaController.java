package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import org.example.tabletop.helpers.SceneSwitcher;

public class ItemEditorProfiVerzijaController {

    @FXML
    private MenuButton boostItemMenu;

    @FXML
    private Button cancelItemCreationButton;

    @FXML
    private Label charismaLabel;

    @FXML
    private Button charismaMinusButton;

    @FXML
    private Button charismaPlusButton;

    @FXML
    private Button confirmItemCreationButton;

    @FXML
    private Button createItemBoostButton;

    @FXML
    private Label enduranceLabel;

    @FXML
    private Button enduranceMinusButton;

    @FXML
    private Button endurancePlusButton;

    @FXML
    private Label freePointsLabel;

    @FXML
    private Label intelligenceLabel;

    @FXML
    private Button intelligenceMinusButton;

    @FXML
    private Button intelligencePlusButton;

    @FXML
    private TextField itemPriceTextField;

    @FXML
    private MenuButton itemRarityMenu;

    @FXML
    private MenuButton itemTypeMenu;

    @FXML
    private Label strengthLabel;

    @FXML
    private Button strengthMinusButton;

    @FXML
    private Button strengthPlusButton;

    @FXML
    private Label wisdomLabel;

    @FXML
    private Button wisdomMinusButton;

    @FXML
    private Button wisdomPlusButton;

    @FXML
    void boostItemMenuClicked(ActionEvent event) {

    }

    @FXML
    void cancelItemCreationButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void charismaMinusButtonClicked(ActionEvent event) {

    }

    @FXML
    void charismaPlusButtonClicked(ActionEvent event) {

    }

    @FXML
    void confirmItemCreationButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void createItemBoostButtonClicked(ActionEvent event) {

    }

    @FXML
    void enduranceMinusButtonClicked(ActionEvent event) {

    }

    @FXML
    void endurancePlusButtonClicked(ActionEvent event) {

    }

    @FXML
    void intelligenceMinusButtonClicked(ActionEvent event) {

    }

    @FXML
    void intelligencePlusButtonClicked(ActionEvent event) {

    }

    @FXML
    void itemRarityMenuClicked(ActionEvent event) {

    }

    @FXML
    void itemTypeMenuClicked(ActionEvent event) {

    }

    @FXML
    void strengthMinusButtonClicked(ActionEvent event) {

    }

    @FXML
    void strengthPlusButtonClicked(ActionEvent event) {

    }

    @FXML
    void wisdomMinusButtonClicked(ActionEvent event) {

    }

    @FXML
    void wisdomPlusButtonClicked(ActionEvent event) {

    }

}
