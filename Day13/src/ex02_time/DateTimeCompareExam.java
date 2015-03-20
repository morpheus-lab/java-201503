package ex02_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam {
	
	public static void main(String[] args) {
		
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("시작일시: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("종료일시: " + endDateTime);
		
		// 두 시각의 선후
		if (startDateTime.isBefore(endDateTime)) {
			System.out.println("진행중...");
		} else if (startDateTime.isAfter(endDateTime)) {
			System.out.println("종료되었음");
		} else if (startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다...");
		}
		
		// 두 시각의 차이
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 년: " + remainYear);
		System.out.println("남은 월: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond);
		
		System.out.println("[종료까지 남은 기간]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("남은 기간: " + period.getYears() + "년 "
				+ period.getMonths() + "개월 "
				+ period.getDays() + "일");
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("남은 시간: " + duration.getSeconds() + " 초");
	}
	
}














