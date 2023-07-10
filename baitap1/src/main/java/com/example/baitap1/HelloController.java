package com.example.baitap1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField USD;
    int rate = 23000;

    @FXML
    protected void a() {
//      double usd= Double.parseDouble(USD.getText());
//      double vnd= usd*rate;
//      VND.setText(String.valueOf(vnd+"vnd"));
        int b=rate*Integer.parseInt(USD.getText());
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(b+"vnd");
        alert.show();
    }
}