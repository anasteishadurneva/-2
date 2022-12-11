module com.example.javatest {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.javatest to javafx.fxml;
    exports com.example.javatest;
}