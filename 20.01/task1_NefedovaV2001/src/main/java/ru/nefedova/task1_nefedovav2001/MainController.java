package ru.nefedova.task1_nefedovav2001;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField bTF;

    @FXML
    private Label rLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float A =Float.parseFloat(aTF.getText().toString());
        float B =Float.parseFloat(bTF.getText().toString());
        rLable.setText("S =" + ((A+B)/2));
    }

}
