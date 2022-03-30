package Calculator;

import com.example.myapp.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
            Scene scene=new Scene(fxmlLoader.load(),400,400);
            scene.getStylesheets().add(Main.class.getResource("Style.css").toExternalForm());
            primarystage.setScene(scene);
            primarystage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
