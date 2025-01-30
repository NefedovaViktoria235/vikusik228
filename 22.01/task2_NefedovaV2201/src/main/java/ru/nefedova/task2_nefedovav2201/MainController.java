package ru.nefedova.task2_nefedovav2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField KTF;

    @FXML
    private TextField NTF;

    @FXML
    private Label RLable;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        try {
            double num1 = Double.parseDouble(NTF.getText());
            double num2 = Double.parseDouble(KTF.getText());

            String result;
            if (num1 > num2) {
                result = "Большее: " + num1 + ", меньшее: " + num2;
            } else if (num2 > num1) {
                result = "Большее: " + num2 + ", меньшее: " + num1;
            } else {
                result = "Числа равны: " + num1;
            }

            RLable.setText(result);
        } catch (NumberFormatException e) {
            RLable.setText("Ошибка ввода. Введите числа.");
        }

    }
}