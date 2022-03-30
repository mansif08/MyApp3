package HealthTracker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HealthController {

    @FXML
    private Button BmiButton;

    @FXML
    private Button CardiacButton;

    @FXML
    private Button ExerButton;

    @FXML
    void handleButtonAction(ActionEvent event) {
        try
        {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BMIDesign.fxml"));
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
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CardiacDesign.fxml"));
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
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ExerciseDesign.fxml"));
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