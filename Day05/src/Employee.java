
public class Employee {
	
	// ��� ���� -------------------------------
	String name;
	String no;
	String dept;
	
	// ������ -------------------------------
	public Employee() {
		this("�̸�����", "�ӽû��", "�ӽúμ�");
//		name = "�̸�����";	no = "�ӽû��";	dept = "�ӽúμ�";
		System.out.println("���� ���� ������ ȣ���");
	}
	
	public Employee(String na, String n, String d) {
		name = na;
		no = n;
		dept = d;
		System.out.println("���� 3��¥�� ������ ȣ���");
	}
	
	// �޼ҵ� -------------------------------
	public void print() {
		System.out.println(name + "," + no + "," + dept);
	}
	
}
