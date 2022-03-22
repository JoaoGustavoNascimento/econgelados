module econgelados {
	requires javafx.controls;
	requires spring.boot.autoconfigure;
	
	opens application to javafx.graphics, javafx.fxml;
}
