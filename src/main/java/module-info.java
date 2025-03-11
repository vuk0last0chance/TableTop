module org.example.tabletop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens org.example.tabletop.controllers to javafx.fxml;

    opens org.example.tabletop to javafx.fxml;
    exports org.example.tabletop;
    exports org.example.tabletop.controllers;
    exports org.example.tabletop.models;

}