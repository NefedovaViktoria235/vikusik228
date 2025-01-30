package ru.nefedova.task1_nefedovav2101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField NTF;

    @FXML
    private Label RLable;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(NTF.getText().toString());
        int b = a/10;
        int c = a%10;
        int d = c * 10 + b;
        RLable.setText("result = " + d);
    }

}
