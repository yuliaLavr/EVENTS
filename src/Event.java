import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Event {
    String name;
    LocalDateTime dateTime;
    String location;

    public Event(String name, LocalDateTime dateTime, String location) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
    }
    public String toString(){
        DateTimeFormatter time= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return "Захід: "+ name+", Дата: "+ dateTime.format(time)+", Місце: "+ location;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
