package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    private ListView<?> listViewer;

    @FXML
    private TextArea textShower;

    @FXML
    private TextArea textWriter;



    @FXML
    void initialize() {
        button1.setOnAction(e -> {
            textShower.setText(textShower.getText().concat("\n"+textWriter.getText()));
            textWriter.setText("");
            });




    }

}
