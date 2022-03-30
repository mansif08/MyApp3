package HealthTracker;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ExerciseController {

    @FXML
    private Button Aerobic;

    @FXML
    private Button BalanceTrain;

    @FXML
    private Button Cardio;

    @FXML
    private Button Endurance;

    @FXML
    private Button StrBuild;

    @FXML
    private Button flexibility;

    @FXML
    void handleAerobic(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AerobicDesign.fxml"));
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
    void handleStrengthBuilding(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StrengthBuildingDesign.fxml"));
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
    void handleEndurance(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EnduranceDesign.fxml"));
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
    void handleFlexibility(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FlexibilityDesign.fxml"));
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
    void handleCardio(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CardioDesign.fxml"));
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



}