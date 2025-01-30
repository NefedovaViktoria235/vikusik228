module ru.nefedova.task1_nefedovav2001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task1_nefedovav2001 to javafx.fxml;
    exports ru.nefedova.task1_nefedovav2001;
}