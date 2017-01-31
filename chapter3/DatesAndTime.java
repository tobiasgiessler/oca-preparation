import java.time.*;
import java.time.format.*;
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

    // formatting using predefined formats
    DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    formatter1.format(date1);
    date1.format(formatter1);
    DateTimeFormatter.ISO_DATE.format(date1);
    date1.format(DateTimeFormatter.ISO_DATE);

    // formatting using self defined patterns
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(""); // empty patter is valid
    formatter2.format(date1);
    // all letters are reserved as pattern letters (escape if it should be included as literal value)
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("\b");
    formatter3.format(date1);
    DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy MM dd");
    formatter4.format(date1);

    // formatting different types (dates, times, date-times)
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

    // dateFormatter.format(time1); // COMPILES BUT THROWS EXCEPTION (UnsupportedTemporalTypeException)

    // LocalDateTime can be formatted as anything
    dateTime1.format(dateFormatter);
    dateTime1.format(timeFormatter);
    dateTime1.format(dateTimeFormatter);

    // LocalTime can be formatted only as time
    // time1.format(dateFormatter); // COMPILES BUT THROWS EXCEPTION (UnsupportedTemporalTypeException)
    time1.format(timeFormatter);
    // time1.format(dateTimeFormatter); // COMPILES BUT THROWS EXCEPTION (UnsupportedTemporalTypeException)

    // LocalDate can be formatted only as date
    date1.format(dateFormatter);
    // date1.format(timeFormatter); // COMPILES BUT THROWS EXCEPTION (UnsupportedTemporalTypeException)
    // date1.format(dateTimeFormatter); // COMPILES BUT THROWS EXCEPTION (UnsupportedTemporalTypeException)
  }
}
