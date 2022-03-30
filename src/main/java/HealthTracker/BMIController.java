package HealthTracker;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class BMIController {

    @FXML
    TextField Height;

    @FXML
    TextField Weight;

    @FXML
    TextField BMI =new TextField("Default text entered here");

    @FXML
    TextField HealthyWeight=new TextField("Default text entered here");

    @FXML
    TextField Suggestion=new TextField("Default text entered here");

    @FXML
    Label validInput=new Label("Default");


    @FXML
    Button Submit;


    double kg,inch,meter,result;
    double idealkgmin;
    double idealkgmax;


        public void HandleSubmit (Event e) {
            try {
                 validInput.setText("");
                String Ws = Weight.getText();


                kg = Double.parseDouble(Ws);


                String Hs = Height.getText();

                inch = Double.parseDouble(Hs);

                if (kg <= 0 || inch <= 0)
                {
                    throw new RuntimeException();
                };

                meter = inch / 39.3701;

                result = kg / (meter * meter);

                // System.out.println(result);
                String BMIs = String.valueOf(String.format("%.2f", result));

                //  System.out.println(BMIs);
                //BMI.setText("");
                BMI.setText("Your BMI: " + BMIs);
                //System.out.println(inch);

                idealkgmin = (18.5 * meter * meter);
                idealkgmax = (24.9 * meter * meter);

                String IKgMins = String.valueOf(String.format("%.2f", idealkgmin));
                String IKgMaxs = String.valueOf(String.format("%.2f", idealkgmax));

                HealthyWeight.setText("Your Healthy Weight : " + IKgMins + "-" + IKgMaxs);

                String suggest = "";

                if (result < 18.5) {
                    suggest = "Need to increase weight";
                } else if (result >= 18.5 && result < 25) {
                    suggest = "Keep up";
                } else if (result >= 25 && result < 30) {
                    suggest = "Balanced diet & exercise";
                } else if (result >= 30 && result < 35) {
                    suggest = "Proper diet & moderate exercise";
                } else if (result >= 35 && result < 40) {
                    suggest = "Diet & rigorous exercise";
                } else if (result >= 40) {
                    suggest = "Lose weight urgently.";
                }


                Suggestion.setText("Suggestion: " + suggest);

            }
            catch(Exception exception)
            {
                //System.out.println(exception);
                validInput.setText("Enter valid input");

            }


        }




}