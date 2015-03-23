package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {
	
	public static void main(String[] args) throws Exception {
		/*
		Student s1 = new Student("홍길동", "12345678", "컴공");
		
		FileOutputStream fos = new FileOutputStream("D:\\stu.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("객체 직렬화 완료");
		*/
		
		// 객체 역직렬화
		FileInputStream fis = new FileInputStream("D:\\stu.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student) ois.readObject();
		
		System.out.println(s.getName());
		System.out.println(s.getStudentNo());
		System.out.println(s.getDept());
		
		ois.close();
		System.out.println("객체 역직렬화 완료");
		
	}
	
}
