package week4Project;

import java.time.Year;
import java.time.Month;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class FindingFriday{
    public static void main (String[] args){
         Year thisYear = Year.now();
         
         for (Month month : Month.values()) { // Loop through all months
            LocalDate date = LocalDate.of(thisYear.getValue(), month, 13); // Set the 13th day of the month
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) { // Check if it's a Friday
                System.out.println("The only friday with 13 in " + thisYear+ " is " + date);
            }
        }
    }
}
