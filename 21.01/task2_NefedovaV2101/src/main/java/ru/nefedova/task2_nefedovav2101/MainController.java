package ru.nefedova.task2_nefedovav2101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label MLable;

    @FXML
    private TextField NTF;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(NTF.getText().toString());
        int min = N / 60;
        MLable.setText("minutes =" + min);    }

}
