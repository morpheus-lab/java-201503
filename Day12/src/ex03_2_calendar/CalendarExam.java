package ex03_2_calendar;

import java.util.Calendar;

public class CalendarExam {
	
	public static void main(String[] args) {
		
//		Calendar now = new Calendar();	// 추상 클래스라서 객체화 불가
		Calendar now = Calendar.getInstance();	// OS에 설정된 시간대와 시간을 나타내는 객체
		
		System.out.println(now.toString());
		
		// get() 메소드로 각종 필드값 조회
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 1월: 0, 2월: 1, ...
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);	// 일: 1, 월: 2, ..., 토: 7
		String strDayOfWeek = null;
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			strDayOfWeek = "일";
			break;
		case Calendar.MONDAY:
			strDayOfWeek = "월";
			break;
		case Calendar.TUESDAY:
			strDayOfWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strDayOfWeek = "수";
			break;
		case Calendar.THURSDAY:
			strDayOfWeek = "목";
			break;
		case Calendar.FRIDAY:
			strDayOfWeek = "금";
			break;
		case Calendar.SATURDAY:
			strDayOfWeek = "토";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strDayOfWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");
	}
	
}
























