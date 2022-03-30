package ToDoList;

import com.example.myapp.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(MainClass.class.getResource("Gui.fxml"));
            Scene scene=new Scene(fxmlLoader.load());
            scene.getStylesheets().add(MainClass.class.getResource("DesignToDo.css").toExternalForm());
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
