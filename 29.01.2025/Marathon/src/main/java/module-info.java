module ru.nefedova.marathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nefedova.marathon to javafx.fxml;
    exports ru.nefedova.marathon;
    exports ru.nefedova.marathon.controller;
    opens ru.nefedova.marathon.controller to javafx.fxml;
}