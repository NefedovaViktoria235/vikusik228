module ru.nefedova.nefedovav3101 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.nefedova.nefedovav3101 to javafx.fxml;
    exports ru.nefedova.nefedovav3101;
}