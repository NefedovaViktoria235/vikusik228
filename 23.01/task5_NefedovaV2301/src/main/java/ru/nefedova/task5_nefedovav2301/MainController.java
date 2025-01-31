package ru.nefedova.task5_nefedovav2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    private static final double INITIAL_DEPOSIT = 1000 ;
    private static final double TARGET_DEPOSIT = 1100 ;
    @FXML
    private Label kLabel;

    @FXML
    private TextField pTF;

    @FXML
    private Label sLabel;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        double P = Double.parseDouble(pTF.getText().toString());
        if (P <= 0 || P >= 25) {
            sLabel.setText("Процентная ставка должна быть в диапазоне (0 - 25)");
        }
        double CD = INITIAL_DEPOSIT;
        int k = 0;
        while(CD <= TARGET_DEPOSIT){
            CD = CD + (CD*P/100);
            k++;
        }
        kLabel.setText("Месяцев: "+k);
        sLabel.setText("Итоговая сумма: =%f"+CD);
    }

}
