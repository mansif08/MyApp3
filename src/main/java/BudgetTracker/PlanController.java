package BudgetTracker;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import BudgetTracker.LocalEvent;

public class PlanController extends LocalEvent2{

    @FXML
    private TextField RemBalance = new TextField("Default text entered here");


    @FXML
    private Label budget=new Label("default");

    @FXML
    private TextField setFood = new TextField("Default text entered here");


    @FXML
    private TextField setTransportation = new TextField("Default text entered here");


    @FXML
    private TextField setHealth = new TextField("Default text entered here");


    @FXML
    private TextField setOthers = new TextField("Default text entered here");


    @FXML
    private Button Submit;

    @FXML
    private TextField getFood = new TextField("Default text entered here");


    @FXML
    private TextField getTransportation = new TextField("Default text entered here");


    @FXML
    private TextField getHealth = new TextField("Default text entered here");


    @FXML
    private TextField getOthers = new TextField("Default text entered here");

    @FXML
    Label validInput;

    int foodPercentage;
    int transportPercentage;
    int healthPercentage;
    int othersPercentage;

    double remCost;
    double foodCost;
    double transportCost;
    double healthCost;
    double othersCost;
    double dailyBudget;

    public void HandleSubmit(Event e) {

        try {
            //System.out.println();
            validInput.setText("");
            String FoodS = setFood.getText();
            foodPercentage = Integer.parseInt(FoodS);

            String TransportS = setTransportation.getText();
            transportPercentage = Integer.parseInt(TransportS);


            String HealthS = setHealth.getText();
            healthPercentage = Integer.parseInt(HealthS);


            String OtherS = setOthers.getText();
            othersPercentage = Integer.parseInt(OtherS);


            if (foodPercentage < 0 || transportPercentage < 0 || healthPercentage < 0 || othersPercentage < 0 || (foodPercentage + transportPercentage + healthPercentage + othersPercentage != 100))
            {
                throw new RuntimeException();

            }
            if(total < 0)
            {
                throw new ArithmeticException();
            }




            RemBalance.setText(String.valueOf(total));
            String RemS = RemBalance.getText();
            remCost = Double.parseDouble(RemS);

            dailyBudget = remCost / 30.0;
            String DailyBudgetG = String.valueOf(String.format("%.2f", dailyBudget));
            budget.setText("You have a budget of " + DailyBudgetG + " /day");


            foodCost = dailyBudget * (foodPercentage / (100.0));
            transportCost = dailyBudget * (transportPercentage / (100.0));
            healthCost = dailyBudget * (healthPercentage / (100.0));
            othersCost = dailyBudget * (othersPercentage / (100.0));

            String FoodG = String.valueOf(String.format("%.2f", foodCost));
            getFood.setText(FoodG);

            String TransportG = String.valueOf(String.format("%.2f", transportCost));
            getTransportation.setText(TransportG);

            String HealthG = String.valueOf(String.format("%.2f", healthCost));
            getHealth.setText(HealthG);

            String OtherG = String.valueOf(String.format("%.2f", othersCost));
            getOthers.setText(OtherG);

        }

        catch(ArithmeticException exception)
        {
            validInput.setText("No budget left");

        }

        catch (Exception exception)
        {
            validInput.setText("Enter valid input");
        }

    }

}
