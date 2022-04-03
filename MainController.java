package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label result;



    private long number1=0;
    private String operator="",result2;
    private boolean start=true;

    private Modal model=new Modal();

    @FXML
    public void processNumbers(ActionEvent event)
    {
        if(start)
        {
            result.setText("");
            result2="";
            start=false;

        }


        if(operator.isEmpty()) {
            String value = ((Button) event.getSource()).getText();
            result.setText(result.getText() + value);
        }

        else
        {
            String value = ((Button) event.getSource()).getText();
            result.setText(result.getText() + value);
            result2=result2+value;
        }


    }

    @FXML
    public void processOperators(ActionEvent event)
    {
        String value=((Button)event.getSource()).getText();

        if(!value.equals("="))
        {
            if(!operator.isEmpty() || start)
            {
                return;
            }

            operator=value;
            number1=Long.parseLong(result.getText());
            //result.setText("");
            result.setText(result.getText()+value);
        }

        else
        {
            if(operator.isEmpty()||start)
            {
                return ;
            }

            long number2=Long.parseLong(result2);
            double output=model.calculate(number1,number2,operator);
            result.setText(result.getText()+"="+String.valueOf(output));
           // result.setText(String.valueOf(output));
            operator="";
            start=true;

        }

    }

}
