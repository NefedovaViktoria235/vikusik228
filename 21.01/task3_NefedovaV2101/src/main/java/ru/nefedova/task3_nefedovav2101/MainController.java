package ru.nefedova.task3_nefedovav2101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField KTF;

    @FXML
    private Label RLable;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int K = Integer.parseInt(KTF.getText().toString());
        int B = K % 7;
        if (1<=K&&K<=365)
            switch (B) {
                case 1:
                    RLable.setText("День Недели: Понедельник");
                    break;
                case 2:
                    RLable.setText("День Недели: Вторник");
                    break;
                case 3:
                    RLable.setText("День Недели: Среда");
                    break;
                case 4:
                    RLable.setText("День Недели: Четверг");
                    break;
                case 5:
                    RLable.setText("День Недели: Пятница");
                    break;
                case 6:
                    RLable.setText("День Недели: Суббота");
                    break;
                case 7:
                    RLable.setText("День Недели: Воскресенье");
                    break;
            }
        else
            RLable.setText("Введите число дней подходящих в этот год");
    }

}
