import java.util.List;
import java.util.Vector;


public class VectorExam {
	
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();	// �Խñ� ���
		
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		System.out.println("����� �� ��: " + list.size());
		
		list.add(new Board("����6", "����6", "�۾���6"));
		list.add(new Board("����7", "����7", "�۾���7"));
		
		System.out.println("����� �� ��: " + list.size());
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + ", " + board.content);
		}
		
	}
	
}
