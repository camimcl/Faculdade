import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;


public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
        //Client client= new Client();
       //ObjectContainer database;
        //database = Db4o.openFile("database");

    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/TelaDeCadastro.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Register");
        primaryStage.setScene(tela);
        primaryStage.show();


    }
}
