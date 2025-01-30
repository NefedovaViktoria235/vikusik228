package ru.nefedova.task1_nefedovav2201;

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
    void sumButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(NTF.getText().toString());
        int b = a/10;
        int c = a%10;
        int d = b+c;
        if (d%3 == 0){
            RLable.setText("Двузначное число кратно 3");
        }else
            RLable.setText("Двузначное число не кратно 3");
    }

}
