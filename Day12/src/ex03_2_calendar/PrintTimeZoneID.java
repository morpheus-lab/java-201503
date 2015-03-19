package ex03_2_calendar;

import java.util.TimeZone;

public class PrintTimeZoneID {
	
	public static void main(String[] args) {
		
		String[] tzIDs = TimeZone.getAvailableIDs();
		for (String id : tzIDs) {
			System.out.println(id);
		}
		
	}
	
}
