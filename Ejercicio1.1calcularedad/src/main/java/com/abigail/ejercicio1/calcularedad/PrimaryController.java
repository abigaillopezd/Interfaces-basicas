
package com.abigail.ejercicio1.calcularedad;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblEdad;

    @FXML
    private void calcularEdad() {
        try {
            DateTimeFormatter formato =
                    DateTimeFormatter.ofPattern("dd/MM/uuuu");

            LocalDate fecha = LocalDate.parse(
                    txtFecha.getText().trim(), formato);

            if (fecha.isAfter(LocalDate.now())) {
                lblEdad.setText("La fecha no puede ser futura");
                return;
            }

            Period edad = Period.between(fecha, LocalDate.now());

            lblEdad.setText("Tiene " + edad.getYears()
                    + " años con " + edad.getMonths() + " meses");

        } catch (DateTimeParseException e) {
            lblEdad.setText("Escribe una fecha válida: dd/mm/aaaa");
        }
    }

    @FXML
    private void limpiar() {
        txtFecha.clear();
        lblEdad.setText("Resultado");
    }
}
