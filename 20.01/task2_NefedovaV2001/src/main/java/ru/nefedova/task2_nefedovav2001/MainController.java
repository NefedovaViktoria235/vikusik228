package ru.nefedova.task2_nefedovav2001;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label aLable;

    @FXML
    private TextField aTF;

    @FXML
    private Label bLable;

    @FXML
    private TextField bTF;

    @FXML
    private Label cLable;

    @FXML
    private TextField cTF;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        String a = aTF.getText();
        String b = bTF.getText();
        String c = cTF.getText();




        aLable.setText("Новые значения: A=" + c);
        bLable.setText("  B=" + a);
        cLable.setText("  C=" + b);
    }

}
