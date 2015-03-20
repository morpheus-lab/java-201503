package ex02_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExam {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("����    : " + now);
		
		LocalDateTime tDateTime = null;
		
		// ���� ����
		tDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println("��������: " + tDateTime);
		
		// ��밪 �̿� ����
		tDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("����ù��    : " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("���ظ�������: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("����ù��    : " + tDateTime);
		
		tDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹���ù��  : " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("�̴޸�������: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("������ù��  : " + tDateTime);
		
		tDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("�̹���ù����: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("���ƿ��¿���: " + tDateTime);
		tDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("���� ����   : " + tDateTime);
		
	}
	
}
