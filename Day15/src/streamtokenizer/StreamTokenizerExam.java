package streamtokenizer;

import java.io.FileReader;
import java.io.StreamTokenizer;

public class StreamTokenizerExam {
	
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("D:\\test.txt");
		StreamTokenizer st = new StreamTokenizer(reader);
		st.slashSlashComments(true); // C++ 家胶内靛 胶鸥老狼 林籍 贸府 咯何
//		st.commentChar('/');
		
		WHILE_LOOP:
		while (true) {
			int ttype = st.nextToken();
			switch (ttype) {
			case StreamTokenizer.TT_WORD:
				System.out.println("TT_WORD: sval = " + st.sval);
				break;
			case StreamTokenizer.TT_NUMBER:
				System.out.println("TT_NUMBER: nval = " + st.nval);
				break;
			case StreamTokenizer.TT_EOF:
				System.out.println("TT_EOF");
				break WHILE_LOOP;
			case StreamTokenizer.TT_EOL:
				System.out.println("TT_EOL");
				break;
			default:
				System.out.println("Unknown: ttype = " + ttype + ", sval = " + st.sval + ", nval = " + st.nval);
				break;
			}
		}
		
	}
	
}
