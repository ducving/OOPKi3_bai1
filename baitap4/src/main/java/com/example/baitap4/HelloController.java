package com.example.baitap4;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField x;
    @FXML
    private TextField y;
    @FXML
    protected void a() {
        double a=Double.parseDouble(x.getText());
        double b=Double.parseDouble(y.getText());
        double c=a+b;
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("tong la"+c);
        alert.show();
    }
    @FXML
    protected void b() {
        double a=Double.parseDouble(x.getText());
        double b=Double.parseDouble(y.getText());
        double c=a-b;
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("hieu la :"+c);
        alert.show();
    }
    @FXML
    protected void c() {
        double a=Double.parseDouble(x.getText());
        double b=Double.parseDouble(y.getText());
        double c=a*b;
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("tich la"+c);
        alert.show();
    }
    @FXML
    protected void d() {
        double a=Double.parseDouble(x.getText());
        double b=Double.parseDouble(y.getText());
        double c=a/b;
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("tich la"+c);
        alert.show();
    }
}