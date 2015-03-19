package ex03_2_calendar;

import java.util.Calendar;

public class CalendarExam {
	
	public static void main(String[] args) {
		
//		Calendar now = new Calendar();	// �߻� Ŭ������ ��üȭ �Ұ�
		Calendar now = Calendar.getInstance();	// OS�� ������ �ð���� �ð��� ��Ÿ���� ��ü
		
		System.out.println(now.toString());
		
		// get() �޼ҵ�� ���� �ʵ尪 ��ȸ
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 1��: 0, 2��: 1, ...
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);	// ��: 1, ��: 2, ..., ��: 7
		String strDayOfWeek = null;
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			strDayOfWeek = "��";
			break;
		case Calendar.MONDAY:
			strDayOfWeek = "��";
			break;
		case Calendar.TUESDAY:
			strDayOfWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strDayOfWeek = "��";
			break;
		case Calendar.THURSDAY:
			strDayOfWeek = "��";
			break;
		case Calendar.FRIDAY:
			strDayOfWeek = "��";
			break;
		case Calendar.SATURDAY:
			strDayOfWeek = "��";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(strDayOfWeek + "���� ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "��");
	}
	
}
























