module org.example.crapsgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.crapsgame to javafx.fxml;
    opens com.example.crapsgame.controller to javafx.fxml;

    exports com.example.crapsgame;
}