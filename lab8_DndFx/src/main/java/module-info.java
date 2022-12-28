module com.dnd.dnd {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.lab8dndfx.dnd to javafx.fxml;
    exports com.lab8dndfx.dnd;
}