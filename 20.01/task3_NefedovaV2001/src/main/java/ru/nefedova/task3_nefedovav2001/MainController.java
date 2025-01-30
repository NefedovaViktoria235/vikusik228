package ru.nefedova.task3_nefedovav2001;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label TfLable;

    @FXML
    private TextField cTF;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        try {            double celsius = Double.parseDouble(cTF.getText());
            double fahrenheit = convertCelsiusToFahrenheit(celsius);
            TfLable.setText(String.format("Температура в °F: %.2f", fahrenheit));
        } catch (NumberFormatException e){
            TfLable.setText("Ошибка: введите число!");
        }
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

}
