module ru.nefedova.task2_nefedovav2001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task2_nefedovav2001 to javafx.fxml;
    exports ru.nefedova.task2_nefedovav2001;
}