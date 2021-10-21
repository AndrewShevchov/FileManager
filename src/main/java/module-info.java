module com.example.laba16 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires poi.ooxml.schemas;
    requires poi.ooxml;
    requires java.desktop;
    requires java.logging;

    opens com.example.laba16 to javafx.fxml;
    exports com.example.laba16;
}