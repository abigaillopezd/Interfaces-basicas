package com.abigail.ejercicio1.controlgastossemanales;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoAlto;

    @FXML
    private void calcular() {
        try {
            double alimentacion = Double.parseDouble(txtAlimentacion.getText().trim());
            double refrigerios = Double.parseDouble(txtRefrigerios.getText().trim());
            double transporte = Double.parseDouble(txtTransporte.getText().trim());
            double telefonia = Double.parseDouble(txtTelefonia.getText().trim());
            double otros = Double.parseDouble(txtOtros.getText().trim());

            double total = alimentacion + refrigerios
                         + transporte + telefonia + otros;

            txtTotal.setText(String.valueOf(total));

            String categoriaMayor = "Alimentación";
            double mayor = alimentacion;

            if (refrigerios > mayor) {
                mayor = refrigerios;
                categoriaMayor = "Refrigerios";
            }

            if (transporte > mayor) {
                mayor = transporte;
                categoriaMayor = "Transporte";
            }

            if (telefonia > mayor) {
                mayor = telefonia;
                categoriaMayor = "Telefonía";
            }

            if (otros > mayor) {
                categoriaMayor = "Otros";
            }

            txtGastoAlto.setText(categoriaMayor);

        } catch (NumberFormatException e) {
            txtTotal.setText("Dato inválido");
            txtGastoAlto.clear();
        }
    }

    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtGastoAlto.clear();
    }
}
