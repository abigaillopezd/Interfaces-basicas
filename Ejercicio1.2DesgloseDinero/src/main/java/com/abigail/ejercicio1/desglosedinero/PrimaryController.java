package com.abigail.ejercicio1.desglosedinero;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML private Label lbl500;
    @FXML private Label lbl200;
    @FXML private Label lbl100;
    @FXML private Label lbl50;
    @FXML private Label lbl20;
    @FXML private Label lbl10;
    @FXML private Label lbl5;
    @FXML private Label lbl2;
    @FXML private Label lbl1;

    @FXML
    private void desglosar() {
        try {
            int dinero = Integer.parseInt(txtDinero.getText().trim());

            if (dinero < 0) {
                limpiarResultados();
                lbl500.setText("Cantidad inválida");
                return;
            }

            lbl500.setText(String.valueOf(dinero / 500));
            dinero %= 500;

            lbl200.setText(String.valueOf(dinero / 200));
            dinero %= 200;

            lbl100.setText(String.valueOf(dinero / 100));
            dinero %= 100;

            lbl50.setText(String.valueOf(dinero / 50));
            dinero %= 50;

            lbl20.setText(String.valueOf(dinero / 20));
            dinero %= 20;

            lbl10.setText(String.valueOf(dinero / 10));
            dinero %= 10;

            lbl5.setText(String.valueOf(dinero / 5));
            dinero %= 5;

            lbl2.setText(String.valueOf(dinero / 2));
            dinero %= 2;

            lbl1.setText(String.valueOf(dinero));

        } catch (NumberFormatException e) {
            limpiarResultados();
            lbl500.setText("Ingresa un entero válido");
        }
    }

    @FXML
    private void limpiar() {
        txtDinero.clear();
        limpiarResultados();
    }

    private void limpiarResultados() {
        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");
        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");
    }
}
