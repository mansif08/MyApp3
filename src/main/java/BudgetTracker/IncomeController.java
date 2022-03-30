package BudgetTracker;

import BudgetTracker.LocalEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class IncomeController {
    @FXML
    Button enterButton;
    @FXML
    TextField IncomeSource;
    @FXML
    TextField IncomeAmount;
    @FXML
    ListView<LocalEvent> eventList;

    @FXML
    Label validInput;

    ObservableList<LocalEvent> list= FXCollections.observableArrayList();

    @FXML
    private void enterEvent(Event e)
    {

        try {
            validInput.setText("");
            list.add(new LocalEvent(IncomeSource.getText(), IncomeAmount.getText()));
            eventList.setItems(list);
            //System.out.println(list.size());

            refresh();
        }
        catch(Exception exception)
        {
            //System.out.println(exception);
            validInput.setText("enter valid input");
        }

    }

    private void refresh()
    {
        IncomeSource.setText("");
        IncomeAmount.setText("");
    }

    @FXML
    private void popEvent(Event e)
    {
        if(list.size()>=1)
        {
            list.remove(0,1);
            eventList.setItems(list);
        }
    }

}
