module com.alesandro.ejercicio3_23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.ejercicio3_23 to javafx.fxml;
    exports com.alesandro.ejercicio3_23;
    exports com.alesandro.ejercicio3_23.controller;
    opens com.alesandro.ejercicio3_23.controller to javafx.fxml;
}