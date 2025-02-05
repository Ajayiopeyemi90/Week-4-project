package week4Project;

	import java.time.LocalDate;
	import java.time.DayOfWeek;
	import java.time.YearMonth;
	import java.time.temporal.TemporalAdjusters;

	public class Main{
		public static void main(String[] args) {
			LocalDate today = LocalDate.now();
			YearMonth currentMonth = YearMonth.from(today);
			LocalDate firstDay = currentMonth.atDay(1).
			with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

			while (firstDay.getMonth() == currentMonth.getMonth()){
			              System.out.println(firstDay);
			       firstDay = firstDay.plusWeeks(1);
	          }
	}
}
