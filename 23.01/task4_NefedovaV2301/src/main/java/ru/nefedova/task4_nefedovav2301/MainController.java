package ru.nefedova.task4_nefedovav2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField nTF;

    @FXML
    private Label rLabel;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTF.getText().toString());
        int k = 0;
        while ((k+1)*(k+1)<=N){
            k++;
        }
        rLabel.setText("Наибольшее число K= " +k);
    }

}
