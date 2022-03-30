package BudgetTracker;
import BudgetTracker.LocalEvent2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ExpenseController {
    @FXML
    Button enterButton;
    @FXML
    TextField ExpenseSource;
    @FXML
    TextField ExpenseAmount;
    @FXML
    ListView<LocalEvent2> eventList;
    @FXML
    Label validInput;

    ObservableList<LocalEvent2> list= FXCollections.observableArrayList();

    @FXML
    private void enterEvent(Event e)
    {

        try {
            list.add(new LocalEvent2(ExpenseSource.getText(), ExpenseAmount.getText()));
            eventList.setItems(list);
            //System.out.println(list.size());

            refresh();
        }
        catch(Exception exception)
        {
            validInput.setText("enter valid input");
        }

    }

    private void refresh()
    {
        ExpenseAmount.setText("");
        ExpenseSource.setText("");
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
