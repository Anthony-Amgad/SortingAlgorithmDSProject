module com.example.datastructurefinalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastructurefinalproject to javafx.fxml;
    exports com.example.datastructurefinalproject;
}