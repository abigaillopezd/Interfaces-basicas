package com.abigail.ejercicio1.cifrasdivisores;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidadCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    @FXML private ListView<String> listaDivisores;

    @FXML
    private void analizar() {
        try {
            int numero = Integer.parseInt(txtNumero.getText().trim());

            if (numero <= 0) {
                limpiarResultados();
                txtCantidadCifras.setText("Ingresa un entero positivo");
                return;
            }

            String cifras = String.valueOf(numero);
            int sumaImpares = 0;
            int sumaPares = 0;
            int sumaTotal = 0;
            int mayor = 0;
            int menor = 9;

            for (char c : cifras.toCharArray()) {
                int cifra = Character.getNumericValue(c);

                sumaTotal += cifra;

                if (cifra % 2 == 0) {
                    sumaPares += cifra;
                } else {
                    sumaImpares += cifra;
                }

                if (cifra > mayor) mayor = cifra;
                if (cifra < menor) menor = cifra;
            }

            txtCantidadCifras.setText(String.valueOf(cifras.length()));
            txtSumaImpares.setText(String.valueOf(sumaImpares));
            txtSumaPares.setText(String.valueOf(sumaPares));
            txtSumaTotal.setText(String.valueOf(sumaTotal));
            txtCifraMayor.setText(String.valueOf(mayor));
            txtCifraMenor.setText(String.valueOf(menor));

            listaDivisores.getItems().clear();

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    listaDivisores.getItems().add(String.valueOf(i));
                }
            }

        } catch (NumberFormatException e) {
            limpiarResultados();
            txtCantidadCifras.setText("Número inválido");
        }
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        limpiarResultados();
    }

    private void limpiarResultados() {
        txtCantidadCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        listaDivisores.getItems().clear();
    }
}
