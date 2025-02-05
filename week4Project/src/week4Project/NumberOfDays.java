package week4Project;

import java.time.Year;
import java.time.YearMonth;
import java.time.Month;
public class NumberOfDays{
    public static void main (String[] arg){
        Year thisYear = Year.now();
        System.out.println("The numbers of days in deffernt months in " + thisYear+ " are: ");
        
        for (Month month: Month.values()){
            YearMonth months = YearMonth.of(thisYear.getValue(), month);
            System.out.printf("%s: %d days.%n", month, months.lengthOfMonth());
        }
    }
}