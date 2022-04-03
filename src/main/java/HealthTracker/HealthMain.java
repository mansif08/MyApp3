package HealthTracker;

import com.example.myapp.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HealthMain extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HealthMain.class.getResource("HealthDesign.fxml"));
            Scene scene=new Scene(fxmlLoader.load());
            //scene.getStylesheets().add(HealthMain.class.getResource("DesignHealth.css").toExternalForm());
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
