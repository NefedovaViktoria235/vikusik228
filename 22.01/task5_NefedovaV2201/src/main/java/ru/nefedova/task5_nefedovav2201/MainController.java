package ru.nefedova.task5_nefedovav2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label rLabel;

    @FXML
    private TextField xTF;

    @FXML
    private TextField yTF;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int x = Integer.parseInt(xTF.getText().toString());
        int y = Integer.parseInt(yTF.getText().toString());

        if (y<x && x<70 && y>0){
            rLabel.setText("Да");
        } else if (y==x && x==70 || x==70 && y==0 || x==0 && y==x) {
            rLabel.setText("На границе");
        }else {
            rLabel.setText("Нет");
        }
    }

}
