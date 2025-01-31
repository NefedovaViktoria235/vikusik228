package ru.nefedova.task6_nefedovav2301;

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
        if (N <= 0) {
            rLabel.setText("N должно быть больше 0");
        }
        boolean Seven = false;
        while (N > 0) {
            if (N%10 == 7) {
                Seven = true;
                break;
            }
            N /= 10;
        }
        rLabel.setText(String.valueOf(Seven));
    }

}
