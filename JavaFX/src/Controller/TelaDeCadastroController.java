package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaDeCadastroController {

    @FXML
    private DatePicker dateOfBirthContainer;

    @FXML
    private TextField emailContainer;

    @FXML
    private ChoiceBox<?> genderContainer;

    @FXML
    private TextField nameContainer;

    @FXML
    private PasswordField passwordContainer;

    @FXML
    private Button registerButton;

    @FXML
    void fazerCadastro(ActionEvent event) {
    String text0=nameContainer.getText();
        System.out.println(text0);
    }

}
