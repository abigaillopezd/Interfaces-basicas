module com.abigail.ejercicio1.cifrasdivisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.abigail.ejercicio1.cifrasdivisores to javafx.fxml;
    exports com.abigail.ejercicio1.cifrasdivisores;
}
