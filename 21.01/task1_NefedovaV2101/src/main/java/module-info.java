module ru.nefedova.task1_nefedovav2101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task1_nefedovav2101 to javafx.fxml;
    exports ru.nefedova.task1_nefedovav2101;
}