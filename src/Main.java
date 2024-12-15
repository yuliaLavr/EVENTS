import java.time.LocalDateTime;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Schedule sc=new Schedule();

        sc.addEvent(new Event("Похід у кіно",LocalDateTime.of(2024,1,12,12,10),"Кінотеатр"));
        sc.addEvent(new Event("Похід у кафе",LocalDateTime.of(2024,12,14,15,20),"Кафе"));
        sc.addEvent(new Event("Похід на каток",LocalDateTime.of(2024,12,1,16,0),"Ковзанка"));

        LocalDate today=LocalDate.now();
        System.out.println(today);

        System.out.println("Доступні заходи: ");
        sc.printAllEvents();

        System.out.println("\nЗахід на цю дату "+ today +":\n"+sc.getEventsByDate(today));

        sc.removePastEvents();
        System.out.println("\nЗаходи, після видалення: ");
        sc.printAllEvents();
    }
}