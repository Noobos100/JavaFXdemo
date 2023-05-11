module com.example.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdemo to javafx.fxml;
    exports com.example.javafxdemo;
    exports com.example.td1;
    exports com.example.partie2;
    exports com.example.partie2.exercice5;
}