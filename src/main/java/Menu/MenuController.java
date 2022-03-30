package Menu;

//import  DailyCalculator.*;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MenuController{

    @FXML
    private Button menuCalc;

    @FXML
    private Button menuToDo;

    @FXML
    private Button menuHealthTracker;

    @FXML
    private Button menuBudget;

    @FXML
    void handleButtonAction(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        }
        catch(Exception e)
        {
            System.out.println("Can not open BMI Window");
        }

    }

    @FXML
    void handleButtonAction2(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Gui.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stages = new Stage();
            stages.setScene(new Scene(root1));
            stages.show();

        }
        catch(Exception e)
        {
            System.out.println("Can not open Cardiac Window");
        }

    }

    @FXML
    void handleButtonAction3(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HealthDesign.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stages = new Stage();
            stages.setScene(new Scene(root1));
            stages.show();

        }
        catch(Exception e)
        {
            System.out.println("Can not open Cardiac Window");
        }

    }

    @FXML
    void handleButtonAction4(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BudgetDesign.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stages = new Stage();
            stages.setScene(new Scene(root1));
            stages.show();

        }
        catch(Exception e)
        {
            System.out.println("Can not open Cardiac Window");
        }
    }


}
