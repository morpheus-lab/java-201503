package ex02_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreationExam {
	
	public static void main(String[] args) throws Exception {
		
		// ���� ��¥ ���
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥: " + currentDate);
		
		// Ư�� ���� ��ü ���
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("��ǥ ��¥: " + targetDate);
		
		// ���� �ð�
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð�: " + currentTime);
		
		// Ư�� �ð�
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("��ǥ �ð�: " + targetTime);
		
		// ��¥ �� �ð� ���
		LocalDateTime cDateTime = LocalDateTime.now();
		System.out.println("���� �Ͻ�: " + cDateTime);
		
		LocalDateTime tDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("��ǥ �Ͻ�: " + tDateTime);
		
		// UTC (���� �����), �ð���(TimeZone)
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("UTC �ð�: " + utcDateTime);
		
		ZonedDateTime nyDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð�: " + nyDateTime);
		
		// Ÿ�ӽ�����
		Instant instant1 = Instant.now();
		Thread.sleep(10);	// ������ 10ms ���� ����
		Instant instant2 = Instant.now();
		if (instant1.isBefore(instant2)) {
			System.out.println("instant1�� �����ϴ�.");
		} else if (instant1.isAfter(instant2)) {
			System.out.println("instant1�� �ʽ��ϴ�.");
		} else {
			System.out.println("������ �ð��Դϴ�.");
		}
		
		System.out.println("�� Ÿ�ӽ������� ���̴�: "
					+ instant1.until(instant2, ChronoUnit.NANOS) + " ns");
		
	}
	
}




















