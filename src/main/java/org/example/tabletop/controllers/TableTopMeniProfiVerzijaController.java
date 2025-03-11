package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.stage.Stage;
import org.example.tabletop.helpers.SceneSwitcher;

import java.io.IOException;

public class TableTopMeniProfiVerzijaController {

    @FXML
    private Tab charactersTabPane;

    @FXML
    private Button createInstanceButton;

    @FXML
    private Button deleteInstanceButton;

    @FXML
    private Button editButtonCharacter;

    @FXML
    private Button editInstanceButton;

    @FXML
    private Button editItemsButton;

    @FXML
    private Button exportInstanceButton;

    @FXML
    private Button importInstanceButton;

    @FXML
    private Tab isntancesTabPane;

    @FXML
    private Button itemsPlusButton;

    @FXML
    private Tab itemsTabPane;

    @FXML
    private Button loadInstanceButton;

    @FXML
    private Button minusButtonCharacter;

    @FXML
    private Button minusItemsButton;

    @FXML
    private Button plusButtonCharacter;

    @FXML
    private Button quitInstanceButton;

    @FXML
    void createInstanceButtonClicked(ActionEvent event) throws IOException {
        System.out.println("Button clicked, switching scene...");
        SceneSwitcher.switchScene(event, "/org/example/tabletop/InstanceCreatorProfiVerzija.fxml");
    }

    @FXML
    void deleteInstanceButtonClicked(ActionEvent event) {

    }

    @FXML
    void editInstanceButtonClicked(ActionEvent event) throws IOException {
        System.out.println("Button clicked, switching scene...");
        SceneSwitcher.switchScene(event, "/org/example/tabletop/InstanceEditorProfiVerzija.fxml");
    }

    @FXML
    void editItemsButtonClicked(ActionEvent event) {
        System.out.println("Button clicked, switching scene...");
        SceneSwitcher.switchScene(event, "/org/example/tabletop/ItemEditorProfiVerzija.fxml");
    }

    @FXML
    void exportInstanceButtonClicked(ActionEvent event) {

    }

    @FXML
    void importInstanceButtonClicked(ActionEvent event) {

    }

    @FXML
    void itemsPlusButtonClicked(ActionEvent event) {
        System.out.println("Button clicked, switching scene...");
        SceneSwitcher.switchScene(event, "/org/example/tabletop/ItemCreatorProfiVerzija.fxml");
    }

    @FXML
    void loadInstanceButtonClicked(ActionEvent event) {

    }

    @FXML
    void minusButtonCharacterClicked(ActionEvent event) {

    }

    @FXML
    void minusItemsButtonClicked(ActionEvent event) {

    }

    @FXML
    void plusButtonCharacterClicked(ActionEvent event) {
        System.out.println("Button clicked, switching scene...");
        SceneSwitcher.switchScene(event,"/org/example/tabletop/CharacterCreatorProfiVerzija.fxml");
    }

    @FXML
    void quitInstanceButtonClicked(ActionEvent event) {
        SceneSwitcher.quitInstance(event);
    }

    public void editButtonCharacterClicked(ActionEvent event) {
        System.out.println("Button clicked, switching scene...");
        SceneSwitcher.switchScene(event,"/org/example/tabletop/CharacterEditorProfiVerzija.fxml");
    }
}
