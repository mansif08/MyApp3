package ToDoList;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalEvent {

    private String description ;
    private LocalDate date;
    LocalTime currentTime = LocalTime.now();


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalEvent(LocalDate date,String description)
    {
        this.setDate(date);
        this.setDescription(description);
    }
    @Override
    public String toString()
    {
        return "On : " +this.getDate() +" "+this.getDescription();

    }
}