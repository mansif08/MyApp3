package BudgetTracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BudgetMain extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(BudgetMain.class.getResource("BudgetDesign.fxml"));
            Scene scene=new Scene(fxmlLoader.load());
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
