package com.example.laba16;

import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class func {
   private static final Desktop desktop = Desktop.getDesktop();

    //Созранение файла
    public static void saveFile(File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Открытие файла
    public static void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Уведомление
    public static void printLog(TextArea textarea, List<File> files) {
        if (files == null || files.isEmpty()) {
            return;
        }
        for (File file : files) {
            textarea.appendText(file.getAbsolutePath() + "\n");
        }
    }

    //Фильтр
    public static void configuringFileChooser(FileChooser fileChooser) {
        // Add Extension Filters
        fileChooser.getExtensionFilters().addAll(//
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("TXT", "*.txt"),
                new FileChooser.ExtensionFilter("DOCX", "*.docx"),
                new FileChooser.ExtensionFilter("XLSX", "*.xlsx"),
                new FileChooser.ExtensionFilter("CSV", "*.csv"));
    }
}
