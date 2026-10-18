module com.abigail.ejercicio1.controlgastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.abigail.ejercicio1.controlgastossemanales to javafx.fxml;
    exports com.abigail.ejercicio1.controlgastossemanales;
}
