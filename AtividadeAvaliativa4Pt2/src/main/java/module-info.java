module com.mycompany.atividadeavaliativa4pt2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.atividadeavaliativa4pt2 to javafx.fxml;
    exports com.mycompany.atividadeavaliativa4pt2;
}
