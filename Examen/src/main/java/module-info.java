module ExamenDIFinal.Examen {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;

    opens ExamenDIFinal.Examen to javafx.fxml;
    exports ExamenDIFinal.Examen;
}