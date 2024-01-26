package Java_Date_And_Time;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // To display the current date,we can use LocalDate class and use its now() method:
        LocalDate date = LocalDate.now();
        System.out.println("Data of Today : "+date);

        // To display the current time (hour,minute,second and nanosecond),we can use
        // LocalTime class and now() method:
        LocalTime time=LocalTime.now();
        System.out.println("Time: " +time);

        //To display the current date and time, we can use LocalTime class and now() method:
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Date and Time: " +dateTime);

        //To separate date from time or any other operations, we can use DateTimeFormatter class
        // with ofPattern() method:
        DateTimeFormatter tformat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate1=time.format(tformat);
        System.out.println(formattedDate1);

        DateTimeFormatter tformatt= DateTimeFormatter.ofPattern("HH:mm");
        String formattedDate2=time.format(tformatt);
        System.out.println(formattedDate2);

        //example of an Application;
       String days= String.valueOf(date.getDayOfWeek());
        System.out.println(days);
        switch (days){
            case "MONDAY":
                System.out.println("Today is Monday !");
                break;
            case "TUESDAY":
                System.out.println("Today is Tuesday !");
                break;
            case "WEDNESDAY":
                System.out.println("Today is Wednesday !");
                break;
            case "THURSDAY":
                System.out.println("Today is Thursday !");
                break;
            case "FRIDAY":
                System.out.println("Today is Friday !");
                break;
            case "SATURDAY":
                System.out.println("Today is Saturday !");
                break;
            case "SUNDAY":
                System.out.println("Today is Sunday !");
                break;
            default :
                System.out.println("There is a problem !");
        }



    }
}
