module com.abigail.ejercicio1.calcularedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.abigail.ejercicio1.calcularedad to javafx.fxml;
    exports com.abigail.ejercicio1.calcularedad;
}
