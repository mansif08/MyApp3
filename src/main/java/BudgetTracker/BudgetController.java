package BudgetTracker;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BudgetController {

    @FXML
    private Button IncomeButton;

    @FXML
    private Button ExpenseButton;

    @FXML
    private Button PlanButton;

    @FXML
    void handleButtonAction(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Income.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        }
        catch(Exception e)
        {
            System.out.println("Can not open Income Window");
        }

    }

    @FXML
    void handleButtonAction2(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Expense.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stages = new Stage();
            stages.setScene(new Scene(root1));
            stages.show();

        }
        catch(Exception e)
        {
            System.out.println("Can not open plan window");
        }

    }

    @FXML
    void handleButtonAction3(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Plan.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stages = new Stage();
            stages.setScene(new Scene(root1));
            stages.show();

        }
        catch(Exception e)
        {
            System.out.println("Can not open plan window");
        }

    }

}