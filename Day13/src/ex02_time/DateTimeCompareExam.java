package ex02_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam {
	
	public static void main(String[] args) {
		
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("�����Ͻ�: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("�����Ͻ�: " + endDateTime);
		
		// �� �ð��� ����
		if (startDateTime.isBefore(endDateTime)) {
			System.out.println("������...");
		} else if (startDateTime.isAfter(endDateTime)) {
			System.out.println("����Ǿ���");
		} else if (startDateTime.isEqual(endDateTime)) {
			System.out.println("�����մϴ�...");
		}
		
		// �� �ð��� ����
		System.out.println("[������� ���� �ð�]");
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
		
		System.out.println("���� ��: " + remainYear);
		System.out.println("���� ��: " + remainMonth);
		System.out.println("���� ��: " + remainDay);
		System.out.println("���� ��: " + remainHour);
		System.out.println("���� ��: " + remainMinute);
		System.out.println("���� ��: " + remainSecond);
		
		System.out.println("[������� ���� �Ⱓ]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("���� �Ⱓ: " + period.getYears() + "�� "
				+ period.getMonths() + "���� "
				+ period.getDays() + "��");
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("���� �ð�: " + duration.getSeconds() + " ��");
	}
	
}














