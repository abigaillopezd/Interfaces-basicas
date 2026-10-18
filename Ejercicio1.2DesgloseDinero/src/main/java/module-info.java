module com.abigail.ejercicio1.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.abigail.ejercicio1.desglosedinero to javafx.fxml;
    exports com.abigail.ejercicio1.desglosedinero;
}
