module chatgb.homework8_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens chatgb.homework8_2 to javafx.fxml;
    exports chatgb.homework8_2;
    exports Client;
    opens Client to javafx.fxml;
    exports Server;
    opens Server to javafx.fxml;
}