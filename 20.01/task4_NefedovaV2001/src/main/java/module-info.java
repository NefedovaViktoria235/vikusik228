module ru.nefedova.task4_nefedovav2001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.task4_nefedovav2001 to javafx.fxml;
    exports ru.nefedova.task4_nefedovav2001;
}