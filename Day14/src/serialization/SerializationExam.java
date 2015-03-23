package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {
	
	public static void main(String[] args) throws Exception {
		/*
		Student s1 = new Student("ȫ�浿", "12345678", "�İ�");
		
		FileOutputStream fos = new FileOutputStream("D:\\stu.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("��ü ����ȭ �Ϸ�");
		*/
		
		// ��ü ������ȭ
		FileInputStream fis = new FileInputStream("D:\\stu.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student) ois.readObject();
		
		System.out.println(s.getName());
		System.out.println(s.getStudentNo());
		System.out.println(s.getDept());
		
		ois.close();
		System.out.println("��ü ������ȭ �Ϸ�");
		
	}
	
}
