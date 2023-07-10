package com.example.baitap3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField width;
    @FXML
    TextField height;

    @FXML
    protected void IBMplanet() {
        double b = Double.parseDouble(width.getText());
        double a= Double.parseDouble(height.getText());
        double BMI=a/(b*b);
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("chi so BMI"+BMI);
        alert.show();
    }
}