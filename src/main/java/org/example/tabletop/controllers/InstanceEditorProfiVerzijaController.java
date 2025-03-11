package org.example.tabletop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import org.example.tabletop.helpers.SceneSwitcher;

public class InstanceEditorProfiVerzijaController {

    @FXML
    private Tab characterTabPaneTab;

    @FXML
    private Button charactersEditButton;

    @FXML
    private Button charactersMinusButton;

    @FXML
    private Button charactersPlusButton;

    @FXML
    private Button editNotesButton;

    @FXML
    private Button forceCustomRulesButton;

    @FXML
    private Button itemsEditButton;

    @FXML
    private Button itemsMinusButton;

    @FXML
    private Tab itemsTabPaneTab;

    @FXML
    private TabPane managmentTabPane;

    @FXML
    private Button minusNotesButton;

    @FXML
    private TextArea notesGMTextArea;

    @FXML
    private Tab notesTabPaneTab;

    @FXML
    private Button plusItemsButton;

    @FXML
    private Button plusNotesButton;

    @FXML
    private MenuButton selectGameMasterMenu;

    @FXML
    private MenuButton selectRulesetMenu;

    @FXML
    private Button confirmInstanceButton;

    @FXML
    private Button cancelInstanceButton;

    @FXML
    void characterTabPaneTabClicked(ActionEvent event) {

    }

    @FXML
    void charactersEditButtonClicked(ActionEvent event) {
        SceneSwitcher.switchScene(event,"/org/example/tabletop/CharacterEditorProfiVerzija.fxml");
    }

    @FXML
    void charactersMinusButtonClicked(ActionEvent event) {

    }

    @FXML
    void charactersPlusButtonClicked(ActionEvent event) {
        SceneSwitcher.switchScene(event,"/org/example/tabletop/CharacterCreatorProfiVerzija.fxml");
    }

    @FXML
    void editNotesButtonClicked(ActionEvent event) {

    }

    @FXML
    void forceCustomRulesButtonClicked(ActionEvent event) {

    }

    @FXML
    void itemsEditButtonClicked(ActionEvent event) {
        SceneSwitcher.switchScene(event,"/org/example/tabletop/ItemEditorProfiVerzija.fxml");
    }

    @FXML
    void itemsMinusButtonClicked(ActionEvent event) {

    }

    @FXML
    void itemsTabPaneTabClicked(ActionEvent event) {

    }

    @FXML
    void minusNotesButtonClicked(ActionEvent event) {

    }

    @FXML
    void notesTabPaneTabClicked(ActionEvent event) {

    }

    @FXML
    void plusItemsButtonClicked(ActionEvent event) {
        SceneSwitcher.switchScene(event,"/org/example/tabletop/ItemCreatorProfiVerzija.fxml");
    }

    @FXML
    void plusNotesButtonClicked(ActionEvent event) {

    }

    @FXML
    void selectGameMasterMenuClicked(ActionEvent event) {

    }

    @FXML
    void selectRulesetMenuClicked(ActionEvent event) {

    }
    @FXML
    void confirmInstanceButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }

    @FXML
    void cancelInstanceButtonClicked(ActionEvent event) {
        SceneSwitcher.goBack(event);
    }
}
