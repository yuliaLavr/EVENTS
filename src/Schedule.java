import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public class Schedule {
    public List<Event> events;
    public Schedule(){
        events= new ArrayList<>();
    }
    public void addEvent(Event event){
        events.add(event);
    }

    public List<Event> getEventsByDate(LocalDate date) {
        List<Event> thisDay=new ArrayList<>();
        for(Event event:events){
            if(event.dateTime.toLocalDate().equals(date)){
                thisDay.add(event);
            }
        }
        return thisDay;
    }
    public void removePastEvents(){
        LocalDateTime today = LocalDateTime.now();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getDateTime().isBefore(today)) {
                events.remove(i);
                i--;
            }
        }
    }
    public void printAllEvents(){
        if(events.isEmpty()){
            System.out.println("Наразі немає заходів.");
        }
        else{
            for(Event event:events){
                System.out.println(event);
            }
        }
    }
}
