package ExamenDIFinal.Examen;

import java.awt.event.ActionEvent;
import java.io.IOException;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NuevosTitulosController {

	@FXML
    private TextField tfArtista;
    
    @FXML
    private TextField tfNombre;
    
    @FXML
    private TextField tfAnno;
    
    @FXML
    private TextField tfMetainfo;
           
    @FXML
    private Button btAceptar;
    
    @FXML
    private Label lbErNombre;
    
    @FXML
    private Label lbErArtista;
    
    @FXML
    private Label lbErAnno;
    
    @FXML
    private Label lbErMetainfo;
    
    @FXML
    @SuppressWarnings("exports")
	public void actionNuevosTitulos(ActionEvent event) throws IOException {
    	nuevosTitulos();
    	TextField textField = null;
		imprimirPantalla(textField);
    	
    }

	private void imprimirPantalla(TextField textField) {
		System.out.println("Los siguientes datos han sido introducidos");
//    	System.out.println("Artista:" + textField.getText(tfArtista));
//    	System.out.println("Nombre:" + textField.getText(tfNombre));
//    	System.out.println("Año" + textField.getText(tfAnno));
//    	System.out.println("Metainfo" + textField.getText(tfMetainfo));
		
	}

	private void nuevosTitulos() throws IOException {
		resetErrors();
		boolean ok = true;

		ok = checkTextFieldEmpty(tfNombre) && ok;
		ok = checkTextFieldEmpty(tfArtista) && ok;
		ok = checkTextFieldEmpty(tfAnno) && ok;
		ok = checkTextFieldEmpty(tfMetainfo) && ok;
	

		if (ok) {
			App m = new App();
			m.changeScene("DatosIntroducidos.fxml");
		}
	}
	
	
	private boolean checkTextFieldEmpty(TextField textField) {
		if (textField.getText() == null || textField.getText().isEmpty()) {
			if (textField.getId().equals("tfNombre")) { lbErNombre.setVisible(true); }
			if (textField.getId().equals("tfArtista")) { lbErArtista.setVisible(true);}
			if (textField.getId().equals("tfAnno")) { lbErAnno.setVisible(true);}
			if (textField.getId().equals("tfMetainfo")) { lbErMetainfo.setVisible(true);}
			return false;
		}

		return true;
	}
	
	private void resetErrors()
	{
		lbErNombre.setVisible(false);
		lbErArtista.setVisible(false);
		lbErAnno.setVisible(false);
		lbErMetainfo.setVisible(false);
	}
    
    
    
 
    
}
