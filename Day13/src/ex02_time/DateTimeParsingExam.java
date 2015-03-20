package ex02_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExam {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2019-12-19");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;	// yyyy-MM-DDTHH:mm:ss.sss
		localDate = LocalDate.parse("2019-09-28", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2031/03/07", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2031.03.07", formatter);
		System.out.println(localDate);
		
	}
	
}




















