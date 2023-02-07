package Java_Date_And_Time;

import java.time.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class DateAndTime_Handling {
    public static void main(String[] args) {

        //1) Write a program to display the current date and time;
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local Date and Time: \n" + dateTime);
        //using dateFormatter;
        DateTimeFormatter cast = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");
        String dateTimeFormatter = dateTime.format(cast);
        System.out.println("Local Date and Time: \n" + dateTimeFormatter);

        //1.1) yesterday date:
        LocalDate tDate = LocalDate.now();
        System.out.println("Yesterday Date: " + tDate.minusDays(1));

        //1.2) Tomorrow date:
        System.out.println("Tomorrow Date: " + tDate.plusDays(1));
        //1.3) to get day of month form of number;
        System.out.println("Day of Month: " + tDate.getDayOfMonth());
        //1.4) to get day of week in form String;
        System.out.println("Day of Week : " + tDate.getDayOfWeek());
        //1.5) to get how many days passed from current year;
        System.out.println("How many days passed from this year: " + tDate.getDayOfYear());
        //1.6) to get month and length of Month;
        System.out.println("Month: " + tDate.getMonth());
        System.out.println("Length of Month: " + tDate.lengthOfMonth());
        //1.7) to get year;
        System.out.println("Year :" + tDate.getYear());
        //1.8) to get lengthOfYear:
        System.out.println("The length of Year: " + tDate.lengthOfYear());

        //2) check the year that is leap year or not;

        LocalDate date = LocalDate.of(2023, 2, 5);
        boolean bool = date.isLeapYear();
        System.out.println("Is this year is a Leap year? " + bool);

        //3)Write a program to print the difference between two dates in days;

        LocalDate randomDate1 = LocalDate.of(1960, 6, 25);
        LocalDate randomDate2 = LocalDate.of(2023, 8, 13);
        Period difference = Period.between(randomDate1, randomDate2);
        System.out.println("Difference between two date : " + difference.getYears() + " years," + difference.getMonths()
                + " months and " + difference.getDays() + " days");
        long days = ChronoUnit.DAYS.between(randomDate1, randomDate2);
        System.out.println("Difference in form days: " + days);


        //4) Write a program to calculate the age of a person in years,
        //months, and days based on their birthdate;

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter your birth year : ");
            int year = scan.nextInt();
            System.out.println("Please enter your birth month : ");
            int month = scan.nextInt();
            System.out.println("Please enter your birth Day : ");
            int day = scan.nextInt();
            LocalDate currentDate = LocalDate.now();
            LocalDate age = LocalDate.of(year, month, day);
            Period period = Period.between(age, currentDate);
            System.out.println("Here is your age;");
            System.out.println("Age: " + period.getYears() + " years, " +
                    period.getMonths() + " months and " + period.getDays() + " days");

        } catch (InputMismatchException ee) {
            System.out.println("Please enter your birthday in form of year,month and day:");
        } catch (DateTimeException exception) {
            System.out.println(exception.toString());
        } finally {
            scan.close();
        }


        //5) Write a program to print the number of days between two dates;

        LocalDate localDate1 = LocalDate.of(1999, 5, 29);
        LocalDate localDate2 = LocalDate.of(1998, 5, 29);
        long daysBetweenTwoDate = ChronoUnit.DAYS.between(localDate2, localDate1);
        System.out.println(daysBetweenTwoDate);

        // 6) parse() method of LocalDate class it will convert string to LocalDate Object:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first date (yyyy-mm-dd): ");
        String firstDate = input.nextLine();
        LocalDate startDate;
        try {
            startDate = LocalDate.parse(firstDate);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter a date in the format yyyy-mm-dd.");
            return;
        }

        System.out.println("Enter second date (yyyy-mm-dd): ");
        String secondDate = input.nextLine();
        LocalDate endDate;
        try {
            endDate = LocalDate.parse(secondDate);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter a date in the format yyyy-mm-dd.");
            return;
        }
        input.close();

        Period diff = Period.between(startDate, endDate);
        System.out.println(diff.getYears() + " years, " + diff.getMonths() + " months, and " + diff.getDays() + " days");


        // 7) Write a program to print the number of seconds between two dates.

        LocalTime localTime1 = LocalTime.of(2, 30, 49);
        LocalTime localTime2 = LocalTime.of(9, 30, 49);
        long seconds = ChronoUnit.SECONDS.between(localTime1, localTime2);
        System.out.println("seconds between two dates: " + seconds);

        //Write a program to find the day of the week for a given date;

        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("Enter a date: (2001-08-04)");
            String sdate = keyboard.nextLine();
            LocalDate findDayOfWeek = LocalDate.parse(sdate);
            System.out.println("Day of week is: " + findDayOfWeek.getDayOfWeek());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeParseException de) {
            System.out.println("The format of day should be like this---->>>yyyy-MM-dd");
        } finally {
            keyboard.close();
        }


        //8)Write a program to calculate the number of hours, minutes, and seconds between two times.
        LocalTime t1 = LocalTime.of(21, 36, 8);
        LocalTime t2 = LocalTime.of(4, 6, 49);
        long hour = ChronoUnit.HOURS.between(t2, t1);
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + ChronoUnit.MINUTES.between(t2, t1));
        System.out.println("Seconds: " + ChronoUnit.SECONDS.between(t2, t1));


        //9) program that find Local Date, Time and Zone:
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(ldt.format(dtf));
        ZoneId zid = ZoneId.systemDefault();
        System.out.println("The current time zone: " + zid);

        //10) program that will print Local Date,Time And Zone;

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);


        // 11) Write a program to print the current time in different time zones;
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        for (String set : zoneId) {
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(set));
            System.out.println("Time zone: " + set + "--->>Current Time: " + zonedDateTime);
        }


        //12) Write a program to find the next date of a given date:

        LocalDate rd = LocalDate.of(2001, 5, 9);
        System.out.println("Next Days: " + rd.plusDays(1) + "\n Next Months: " + rd.plusMonths(5));


        System.out.println("Signature:\n" +
                "Omer Uruc");


    }
}
