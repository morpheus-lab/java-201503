import java.util.List;
import java.util.Vector;


public class VectorExam {
	
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();	// 게시글 목록
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		System.out.println("저장된 글 수: " + list.size());
		
		list.add(new Board("제목6", "내용6", "글쓴이6"));
		list.add(new Board("제목7", "내용7", "글쓴이7"));
		
		System.out.println("저장된 글 수: " + list.size());
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + ", " + board.content);
		}
		
	}
	
}
