package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import Clientpackage.Client;


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
    Client client= new Client();
    ObjectContainer db;

    @SuppressWarnings("deprecation")
    public void fazerCadastro(ActionEvent event) {
        db = Db4o.openFile("database.dbo");
        String name = nameContainer.getText();
        // String password = passwordContainer.getText();
        String email = emailContainer.getText();
        client.setEmail(email);
        client.setName(name);

        db.store(client);
        db.close();
        ObjectSet<Client>lista;
        db= Db4o.openFile("database.dbo");
        lista= db.query(Client.class);
        while (lista.hasNext()) {
            client = lista.next();
            System.out.println("################");
            System.out.println(client.getName());
            System.out.println(client.getEmail());
        }
    
    }}