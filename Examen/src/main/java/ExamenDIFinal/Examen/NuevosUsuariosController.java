package ExamenDIFinal.Examen;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NuevosUsuariosController {

	@FXML
    private TextField tfNombre;
    
    @FXML
    private TextField tfEmail;
    
    @FXML
    private TextField tfContraseña;
    
   
    @FXML
    private Button btAceptar;
    
    @FXML
    private Button btCancelar;
    
    @FXML
    private Label lbErNombre;
    
    @FXML
    private Label lbErEmail;
    
    @FXML
    private Label lbErContraseña;
    
   
    
    @SuppressWarnings("exports")
	public void actionNuevoUsuario(ActionEvent event) throws IOException {
    	nuevoUsuario();
    	TextField textField = null;
		imprimirPantalla(textField);
    	
    }

	private void imprimirPantalla(TextField textField) {
		System.out.println("Los siguientes datos han sido introducidos");
//    	System.out.println("Usuario:" + textField.getText(tfArtista));
//    	System.out.println("Email:" + textField.getText(tfNombre));
//    	System.out.println("Contraseña");

		
	}

	private void nuevoUsuario() throws IOException {
		resetErrors();
		boolean ok = true;

		ok = checkTextFieldEmpty(tfNombre) && ok;
		ok = checkTextFieldEmpty(tfEmail) && ok;
		ok = checkTextFieldEmpty(tfContraseña) && ok;

	

		if (ok) {
			App m = new App();
			m.changeScene("DatosIntroducidos.fxml");
		}
	}
	
	
	private boolean checkTextFieldEmpty(TextField textField) {
		if (textField.getText() == null || textField.getText().isEmpty()) {
			if (textField.getId().equals("tfNombre")) { lbErNombre.setVisible(true); }
			if (textField.getId().equals("tfEmail")) { lbErEmail.setVisible(true);}
			if (textField.getId().equals("tfContraseña")) { lbErContraseña.setVisible(true);}

			return false;
		}

		return true;
	}
	
	private void resetErrors()
	{
		lbErNombre.setVisible(false);
		lbErEmail.setVisible(false);
		lbErContraseña.setVisible(false);
	
	}
	
	public void actionCancelar(ActionEvent event) throws IOException {
		resetTextFields();
    	
    	
    }
	private void resetTextFields() {
		tfNombre.setText("");
	    tfEmail.setText("");
	    tfContraseña.setText("");
	   
	}
    
    
    
 
    
}