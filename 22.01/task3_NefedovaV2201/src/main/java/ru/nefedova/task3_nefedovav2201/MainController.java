package ru.nefedova.task3_nefedovav2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField ATF;

    @FXML
    private TextField BTF;

    @FXML
    private TextField KTF;

    @FXML
    private TextField NTF;

    @FXML
    private Label RLable;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        try {
            int num1 = Integer.parseInt(NTF.getText());
            int num2 = Integer.parseInt(KTF.getText());
            int num3 = Integer.parseInt(ATF.getText());
            int num4 = Integer.parseInt(BTF.getText());

            int[] numbers = {num1, num2, num3, num4};
            int differentNumberIndex = findDifferentNumber(numbers);

            if (differentNumberIndex != -1) {
                RLable.setText("Порядковый номер отличного числа: " + (differentNumberIndex + 1));
            } else {
                RLable.setText("Все числа равны или введены некорректные данные.");
            }
        } catch (NumberFormatException e) {
            RLable.setText("Ошибка ввода. Введите целые числа.");
        }
    }

    private int findDifferentNumber(int[] numbers) {
        if (numbers.length != 4) {
            return -1; // Некорректный массив
        }

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 4; i++){
            if (numbers[i] == numbers[0]){
                count1++;
            } else if (numbers[i] == numbers[1]){
                count2++;
            }
        }

        if (count1 == 3) return 0;
        if (count2 == 3) return 1;
        if (numbers[2] == numbers[0] && numbers[3] != numbers[0]) return 3;
        if (numbers[3] == numbers[0] && numbers[2] != numbers[0]) return 2;
        if (numbers[2] == numbers[1] && numbers[3] != numbers[1]) return 3;
        if (numbers[3] == numbers[1] && numbers[2] != numbers[1]) return 2;


        return -1; // Все числа различны или некорректный ввод
    }

}
