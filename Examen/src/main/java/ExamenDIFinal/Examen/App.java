package ExamenDIFinal.Examen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			stg = primaryStage;
	        primaryStage.setResizable(false);
			Scene scene = new Scene(loadFXML("NuevosTitulos"), 600, 400);
			primaryStage.setTitle("Nuevo Titulo en Discoteca");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
	
	public Stage getStg() {
		return stg;
	}

	public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
     
    }

	public void changeScene(String fxml, Object data) throws IOException {

		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }
	
	public static void main(String[] args) { launch(args); }
}