package ex03_2_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneCalendarExam {
	
	public static void main(String[] args) {
		
		String fmt = "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS";
		
		TimeZone tzSeoul = TimeZone.getTimeZone("Asia/Seoul");
		Calendar calSeoul = Calendar.getInstance(tzSeoul);	// ���� �ð�
		System.out.printf("Seoul : " + fmt + "\n", calSeoul);
		
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		Calendar calNY = Calendar.getInstance(tzNY);	// ���� �ð�
		System.out.printf("NY    : " + fmt + "\n", calNY);
		
		TimeZone tzHawaii = TimeZone.getTimeZone("Pacific/Honolulu");
		Calendar calHawaii = Calendar.getInstance(tzHawaii);	// �Ͽ��� �ð�
		System.out.printf("Hawaii: " + fmt + "\n", calHawaii);
	}
	
}
