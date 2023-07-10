module com.example.baith2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baith2 to javafx.fxml;
    exports com.example.baith2;
}