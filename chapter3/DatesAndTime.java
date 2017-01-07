import java.time.*;
import java.time.temporal.ChronoUnit;

public class DatesAndTime {
  public static void main(String[] args) {
    // creating dates, times, and date-times
    LocalDate date1 = LocalDate.now();
    LocalTime time1 = LocalTime.now();
    LocalDateTime dateTime1 = LocalDateTime.now();

    LocalDate date2 = LocalDate.of(2017, 1, 7);
    LocalTime time2 = LocalTime.of(17, 34, 01);
    LocalDateTime dateTime2 = LocalDateTime.of(2017, 1, 7, 17, 34, 01);

    // calculation with dates and time
    /*
    Since date objects are immutable, every calculation creates a new object.
    */
    LocalDate calculatedDate1 = date1.plusDays(1);
    LocalDate calculatedDate2 = date1.plusMonths(1);
    LocalDate calculatedDate3 = date1.plusYears(1);

    LocalTime calculatedTime1 = time1.plusSeconds(1);
    LocalTime calculatedTime2 = time1.plusMinutes(1);
    LocalTime calculatedTime3 = time1.plusHours(1);

    LocalDateTime calculatedDateTime1 = dateTime1.plusSeconds(1);
    LocalDateTime calculatedDateTime2 = dateTime1.plusMinutes(1);
    LocalDateTime calculatedDateTime3 = dateTime1.plusHours(1);
    LocalDateTime calculatedDateTime4 = dateTime1.plusDays(1);
    LocalDateTime calculatedDateTime5 = dateTime1.plusMonths(1);
    LocalDateTime calculatedDateTime6 = dateTime1.plusYears(1);

    // Calculation using the interface TemporalUnit and the enumeration ChronoUnit
    LocalDateTime calculatedDateTime7 = dateTime1.plus(1, ChronoUnit.DAYS);
    // Calculation using the interface TemporalAmount and the implementations
    // Duration and Period
    LocalDateTime calculatedDateTime8 = dateTime1.plus(Duration.ofDays(1));
    LocalDateTime calculatedDateTime9 = dateTime1.plus(Period.ofDays(1));

    // formatting
  }
}
