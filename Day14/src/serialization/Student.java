package serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;	// 이름
	private String studentNo;	// 학번
	private String dept;	// 학과
	
	public Student(String name, String studentNo, String dept) {
		this.name = name;
		this.studentNo = studentNo;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
