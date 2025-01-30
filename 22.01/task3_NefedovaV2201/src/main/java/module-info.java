module ru.nefedova.task3_nefedovav2201 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task3_nefedovav2201 to javafx.fxml;
    exports ru.nefedova.task3_nefedovav2201;
}