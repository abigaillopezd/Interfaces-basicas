package com.abigail.ejercicio1.tablamultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtResultados;

    @FXML
    private void calcular() {
        try {
            int numero = Integer.parseInt(txtNumero.getText().trim());

            StringBuilder tabla = new StringBuilder();

            for (int i = 1; i <= 10; i++) {
                tabla.append(numero)
                     .append(" x ")
                     .append(i)
                     .append(" = ")
                     .append(numero * i)
                     .append("\n");
            }

            txtResultados.setText(tabla.toString());

        } catch (NumberFormatException e) {
            txtResultados.setText(
                "Por favor, ingresa un número entero válido."
            );
        }
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtResultados.clear();
    }
}
