module com.abigail.ejercicio1.tablamultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.abigail.ejercicio1.tablamultiplicar to javafx.fxml;
    exports com.abigail.ejercicio1.tablamultiplicar;
}
