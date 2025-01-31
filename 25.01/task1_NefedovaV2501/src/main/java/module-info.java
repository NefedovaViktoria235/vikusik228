module ru.nefedova.task1_nefedovav2501 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.nefedova.task1_nefedovav2501 to javafx.fxml;
    exports ru.nefedova.task1_nefedovav2501;
}