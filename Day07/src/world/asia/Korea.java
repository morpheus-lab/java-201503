package world.asia;

public class Korea {
	
	private int population;	// �α�
	String capital;	// ����
	private String[] specialList = {"���ֽ�ũ", "�뱸���", "õ��ȣ������"};	// ����Ư�깰
	public int i;	// public �׽�Ʈ��
	
	public void setPopulation(int p) {
		population = p;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public String[] getList() {
		return specialList;
	}
	
	void test() {
		capital = "����";
		i = 10;
		System.out.println(Math.PI);
	}
	
}
