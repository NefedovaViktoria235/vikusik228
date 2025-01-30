module ru.nefedova.task2_nefedovav2101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task2_nefedovav2101 to javafx.fxml;
    exports ru.nefedova.task2_nefedovav2101;
}