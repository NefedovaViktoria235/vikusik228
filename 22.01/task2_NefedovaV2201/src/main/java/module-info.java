module ru.nefedova.task2_nefedovav2201 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task2_nefedovav2201 to javafx.fxml;
    exports ru.nefedova.task2_nefedovav2201;
}