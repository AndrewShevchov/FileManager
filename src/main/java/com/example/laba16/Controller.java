package com.example.laba16;
import java.util.Arrays;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import javafx.stage.FileChooser;
import static com.example.laba16.func.*;

public class Controller {

    private Stage stage;

    //Создание файла
    public void CreateFile(ActionEvent event) throws Exception{

        final  FileChooser fileChooser = new FileChooser();
        configuringFileChooser(fileChooser);

        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            func.saveFile(file);
        }
    }

    //кнопка работы с тхт
    public void switchToTxt(ActionEvent event) throws IOException
    {
        final  FileChooser fileChooser = new FileChooser();
        textarea.clear();
        configuringFileChooser(fileChooser);
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            openFile(file);
            List<File> files = Arrays.asList(file);
            printLog(textarea, files);
        }
    }

    //кнопка работы с ворд
    public void switchToWord(ActionEvent event) throws IOException
    {
        final  FileChooser fileChooser = new FileChooser();
        textarea.clear();
        configuringFileChooser(fileChooser);
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            openFile(file);
            List<File> files = Arrays.asList(file);
            printLog(textarea, files);
        }

    }

    //кнопка работы с эксель
    public void switchToExel(ActionEvent event) throws IOException
    {
        final  FileChooser fileChooser = new FileChooser();
        textarea.clear();
        configuringFileChooser(fileChooser);

        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            openFile(file);
            List<File> files = Arrays.asList(file);
            printLog(textarea, files);
        }

    }

   // кнопка работы с цсв
    public void switchToCSV(ActionEvent event) throws IOException
    {
        final  FileChooser fileChooser = new FileChooser();
        textarea.clear();
        configuringFileChooser(fileChooser);

        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            openFile(file);
            List<File> files = List.of(file);
            printLog(textarea, files);
        }
    }

    @FXML
    private TextArea textarea;

    @FXML
    private AnchorPane help_bt;

    @FXML
    private MenuBar exit_btn;

    @FXML
    private MenuItem txt_input_btn;

    @FXML
    private MenuItem input_word_btn;

    @FXML
    private MenuItem input_xl_btn;

    @FXML
    private MenuItem input_csv_btn;

    @FXML
    void initialize() {
        assert help_bt != null : "fx:id=\"help_bt\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert exit_btn != null : "fx:id=\"exit_btn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txt_input_btn != null : "fx:id=\"txt_input_btn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert input_word_btn != null : "fx:id=\"input_word_btn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert input_xl_btn != null : "fx:id=\"input_xl_btn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert input_csv_btn != null : "fx:id=\"input_csv_btn\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
}

