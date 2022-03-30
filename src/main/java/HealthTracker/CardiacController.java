package HealthTracker;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CardiacController {

    @FXML
    TextField Pulse;

    @FXML
    TextField DiastolicPressure;

    @FXML
    TextField SystolicPressure;


    @FXML
    TextField PulseIndication=new TextField("Default text entered here");


    @FXML
    TextField PressureIndication=new TextField("Default text entered here");

    @FXML
    Button Submit;

    @FXML
    Label validInput=new Label("default");



    int pulse,diastolicPressure,systolicPressure;

    public void HandleSubmit(Event e) {


        try {

            validInput.setText("");
            String Ps = Pulse.getText();

             pulse = Integer.parseInt(Ps);

            String Dis = DiastolicPressure.getText();

            diastolicPressure = Integer.parseInt(Dis);

            String Sys = SystolicPressure.getText();

             systolicPressure = Integer.parseInt(Sys);

            if (pulse <= 0 || diastolicPressure <= 0 || systolicPressure <= 0) {
                throw new RuntimeException();
            }

            String PressureI = "";
            String PulseI = "";

            if (pulse < 60) {
                PulseI = "Low Pulse Rate";
            } else if (pulse > 130) {
                PulseI = "High Pulse Rate";
            } else {
                PulseI = "Normal Pulse Rate";
            }

            if (diastolicPressure > 145) {
                PressureI = "High Pressure";
            } else if (diastolicPressure < 110) {
                PressureI = "Low Pressure";
            } else {
                PressureI = "Normal Pressure";
            }


            PulseIndication.setText("Pulse Indication: " + PulseI);
            PressureIndication.setText("Pressure Indication: " + PressureI);
        }
        catch (Exception exception)
        {
        //    System.out.println(e);
            validInput.setText("Enter valid input");
        }


    }

}