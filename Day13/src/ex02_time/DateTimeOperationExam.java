package ex02_time;

import java.time.LocalDateTime;

public class DateTimeOperationExam {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: " + now);
		
		LocalDateTime target = now
				.plusYears(1)
				.minusMonths(3)
				.plusDays(4)
				.plusHours(2)
				.minusMinutes(40)
				.plusSeconds(30);
		System.out.println("목표: " + target);
		
	}
	
}
