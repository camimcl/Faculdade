import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Teste pro trabalho");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/TelaDeCadastro.fxml"));
        Parent root = fxmlLoader.load();//scene eh o painel, n a janela
        Scene tela = new Scene(root); //scene depende de uma tela real, que eh o fxmlloader

        // Stage st = new Stage();// stage eh a janela, eh onde joga o painel
        // st.setTitle("Segunda tela");
        // st.setScene(tela);
        primaryStage.setTitle("Trabalho");
        primaryStage.setScene(tela);
        primaryStage.show();
        // Button botao = new Button("Clique aqui");
        // botao.setOnAction(new EventHandler<ActionEvent>() {

        //     @Override
        //     public void handle(ActionEvent event) {
        //        System.out.println("funciona");
        //     }
            
        // });
        // StackPane root = new StackPane();
        // root.getChildren().addAll(botao);
        // primaryStage.setScene(new Scene(root,300,250));
        // primaryStage.show();
    }
}
