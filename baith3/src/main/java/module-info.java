module com.example.baith3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baith3 to javafx.fxml;
    exports com.example.baith3;
}