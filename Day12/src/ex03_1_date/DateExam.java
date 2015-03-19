package ex03_1_date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExam {
	
	public static void main(String[] args) {
		
		Date now = new Date();	// 현재 시간으로 Date 객체 생성
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}
	
}
