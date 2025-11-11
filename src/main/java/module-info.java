module com.example.inclassassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inclassassignment to javafx.fxml;
    exports com.example.inclassassignment;
}