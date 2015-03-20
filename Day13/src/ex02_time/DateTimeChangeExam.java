package ex02_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExam {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재    : " + now);
		
		LocalDateTime tDateTime = null;
		
		// 직접 변경
		tDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println("직접변경: " + tDateTime);
		
		// 상대값 이용 변경
		tDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해첫날    : " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해마지막날: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("내년첫날    : " + tDateTime);
		
		tDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달첫날  : " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이달마지막날: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음달첫날  : " + tDateTime);
		
		tDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달첫월욜: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는월욜: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월욜   : " + tDateTime);
		
	}
	
}
