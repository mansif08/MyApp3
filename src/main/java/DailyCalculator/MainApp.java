package DailyCalculator;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

 public class MainApp extends Application {
    @Override
    public void start(Stage primarystage) throws Exception {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("Main.fxml"));
            Scene scene=new Scene(fxmlLoader.load(),400,400);
            scene.getStylesheets().add(MainApp.class.getResource("calc_stylesheet.css").toExternalForm());
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
