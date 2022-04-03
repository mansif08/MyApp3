package ToDoList;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class GuiController  implements Initializable{

  public void initialize(URL url,ResourceBundle rb)
  {
    datePicker.setValue(LocalDate.now());
  }

  @FXML
  Button addButton;
  @FXML
  Button popButton;
  @FXML
  TextField descriptionTextField;
  @FXML
  DatePicker datePicker;
  @FXML
  ListView<LocalEvent>eventList;

  ObservableList<LocalEvent>list= FXCollections.observableArrayList();


  @FXML
  private void addEvent(Event e)
  {
    list.add(new LocalEvent(datePicker.getValue(),descriptionTextField.getText()));
    eventList.setItems(list);
    //System.out.println(list.size());

    refresh();

  }

  private void refresh()
  {
    datePicker.setValue(LocalDate.now());
    descriptionTextField.setText("");
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