module ru.nefedova.task3_nefedovav2101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task3_nefedovav2101 to javafx.fxml;
    exports ru.nefedova.task3_nefedovav2101;
}