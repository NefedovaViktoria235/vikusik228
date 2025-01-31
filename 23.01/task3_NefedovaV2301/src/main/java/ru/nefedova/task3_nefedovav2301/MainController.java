package ru.nefedova.task3_nefedovav2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label dLabel;

    @FXML
    private Label lLabel;

    @FXML
    private TextField nTF;

    @FXML
    private Label rLabel;

    @FXML
    private Label sLabel;

    @FXML
    private TextField zTF;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int Num = Integer.parseInt(nTF.getText().toString());
        int Value = Integer.parseInt(zTF.getText().toString());
        if (Num<1 || Num>4){
        }
        double Radius =1, Diameter=1, Length=1, Area=1;
        switch (Num){
            case 1:
                Radius=Value;
                Diameter=2*Radius;
                Length=2*3.14*Radius;
                Area=3.14*Math.pow(Radius,2);
                break;
            case 2:
                Diameter=Value;
                Radius=Diameter/2;
                Length=2*3.14*Radius;
                Area=3.14*Math.pow(Radius,2);
                break;
            case 3:
                Length=Value;
                Radius=Length/(2*3.14);
                Diameter=2*Radius;
                Area=3.14*Math.pow(Radius,2);
                break;
            case 4:
                Area=Value;
                Radius=Math.sqrt(Area/3.14);
                Diameter=2*Radius;
                Length=2*3.14*Radius;
                break;
        }
        rLabel.setText("Радиус =" + Radius);
        dLabel.setText("Диаметр =" + Diameter);
        lLabel.setText("Длина =" + Length);
        sLabel.setText("Площадь =" + Area);
    }
}
