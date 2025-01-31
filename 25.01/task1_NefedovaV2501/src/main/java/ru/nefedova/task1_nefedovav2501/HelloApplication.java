package ru.nefedova.task1_nefedovav2501;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.lang.Math.*;

import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;
    private Scene scene5;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = creatScene1();
        scene2 = creatScene2();
        scene3 = creatScene3();
        scene4 = creatScene4();
        scene5 = creatScene5();
        primaryStage.setTitle("Практическая номер 6");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene creatScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("вычислить");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                float A =Float.parseFloat(sideAField.getText().toString());
                float B =Float.parseFloat(sideBField.getText().toString());
                resultLabel.setText("S =" + ((A+B)/2));
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField,new Label("b="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene creatScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        TextField sideCField = new TextField();
        Button calcButton = new Button("результат");
        Label aLabel = new Label();
        Label bLabel = new Label();
        Label cLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                String a = sideAField.getText();
                String b = sideBField.getText();
                String c = sideCField.getText();




                aLabel.setText("Новые значения: A=" + c);
                bLabel.setText("  B=" + a);
                cLabel.setText("  C=" + b);
            } catch (ArithmeticException e) {
                aLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField,new Label("c="), sideCField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, aLabel, bLabel, cLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    public static void main(String[] args) {
        launch();
    }

    private Scene creatScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideTcField = new TextField();
        Button calcButton = new Button("вычислить температуру");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double celsius = Double.parseDouble(sideTcField.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                resultLabel.setText(String.format("Температура в °F: %.2f", fahrenheit));
            } catch (NumberFormatException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("Tc="), sideTcField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene creatScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideXField = new TextField();
        TextField sideAField = new TextField();
        TextField sideCField = new TextField();
        TextField sideWField = new TextField();
        TextField sideTField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLabel = new Label();
        Label gLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double x = Double.parseDouble(sideXField.getText());
                double a = Double.parseDouble(sideAField.getText());
                double c = Double.parseDouble(sideCField.getText());
                double t = Double.parseDouble(sideTField.getText());
                double w = Double.parseDouble(sideWField.getText());
                double g = c + 2.48 ;
                gLabel.setText("g = " + g);
                double y = (Math.pow(x, 5) * Math.cbrt(a*x + Math.sqrt(Math.abs(a + x)))) / (4 * Math.pow(Math.cos(a*x),2)) + Math.pow(g, x) + w*t;
                resultLabel.setText("y = " + y);
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x="), sideXField, new Label("a="), sideAField, new Label("c="), sideCField, new Label("w="), sideWField, new Label("t="), sideTField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, gLabel, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
    private Scene creatScene5() {
        Label titleLabel = new Label("Задание 5");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        TextField sideCField = new TextField();
        TextField sideA1Field = new TextField();
        TextField sideB1Field = new TextField();
        TextField sideC1Field = new TextField();
        Button calcButton = new Button("Найти периметр");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double a1 = Double.parseDouble(sideAField.getText());
                double a2 = Double.parseDouble(sideBField.getText());
                double b1 = Double.parseDouble(sideCField.getText());
                double b2 = Double.parseDouble(sideA1Field.getText());
                double c1 = Double.parseDouble(sideB1Field.getText());
                double c2 = Double.parseDouble(sideC1Field.getText());
                double d = a1 * b2 - a2 * b1;
                double x = (c1 * b2 - c2 * b1) / d;
                double y = (a1 * c2 - a2 * c1) / d;
                if (d != 0) {
                    resultLabel.setText("" + x);
                    resultLabel.setText("" + y);
                }
                else {
                    resultLabel.setText("Нет решения!");
                    resultLabel.setText("Нет решения!");
                }
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, sideBField, sideCField, sideA1Field, sideB1Field, sideC1Field);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
}