package reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReaderExam {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("D:\\test1.txt");
		
		InputStreamReader reader = new InputStreamReader(in);
		
		BufferedReader bReader = new BufferedReader(reader);
		
		/*
		while (true) {
			int data = reader.read();
//			int data = in.read();
			if (data == -1) break;
			
			System.out.print((char) data);
		}
		
		reader.close();
		*/
		/*
		System.out.println("1: " + bReader.readLine());
		System.out.println("2: " + bReader.readLine());
		System.out.println("3: " + bReader.readLine());
		*/
		while (true) {
			String line = bReader.readLine();
			if (line == null) break;	// 더 이상 읽어 올 데이터가 없을 때 null 리턴
			
			System.out.println(line);
		}
		
		bReader.close();
	}
	
}


















