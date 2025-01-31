package ru.nefedova.task4_nefedovav2001;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField cTF;

    @FXML
    private Label gLable;

    @FXML
    private TextField tTF;

    @FXML
    private TextField wTF;

    @FXML
    private TextField xTF;

    @FXML
    private Label zLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTF.getText().toString());
        double a = Double.parseDouble(aTF.getText().toString());
        double c = Double.parseDouble(cTF.getText().toString());
        double t = Double.parseDouble(tTF.getText().toString());
        double w = Double.parseDouble(wTF.getText().toString());
        double g = c + 2.48 ;
        gLable.setText("g = " + g);
        double y = (Math.pow(x, 5) * Math.cbrt(a*x + Math.sqrt(Math.abs(a + x)))) / (4 * Math.pow(Math.cos(a*x),2)) + Math.pow(g, x) + w*t;
        zLable.setText("y = " + y);
    }

}
