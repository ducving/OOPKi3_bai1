package com.example.bai4;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField number;

    @FXML
    public void enter(){
        int number =  Integer.parseInt(this.number.getText());
        int randomNum= (int) (Math.random()*100+1);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if( number== randomNum){
            alert.setContentText("true, this number is: "+randomNum);
            alert.show();
        }else {
            alert.setContentText("fail, this number is: "+randomNum);
            alert.show();
        }
    }
}