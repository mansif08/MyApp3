package Menu;

import DailyCalculator.MainApp;
import com.example.myapp.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuApp extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(MenuApp.class.getResource("Menu.fxml"));
            Scene scene=new Scene(fxmlLoader.load(),400,400);
          //  scene.getStylesheets().add(MenuApp.class.getResource("calc_stylesheet.css").toExternalForm());
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
