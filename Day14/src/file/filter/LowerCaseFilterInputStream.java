package file.filter;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseFilterInputStream extends FilterInputStream {

	public LowerCaseFilterInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int data = super.read();
		// data가 소문자이면, 대문자로 변환
		if (data >= 'a' && data <= 'z') {
			data -= 32;
		}
		return data;
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int readBytes = super.read(b, off, len);
		// off 인덱스 ~ off + readBytes - 1 인덱스 데이터에 대해 소문자 검사
		for (int i = off; i < off + readBytes; i++) {
			// b[i] 가 소문자이면 대문자로 변환
			if (b[i] >= 'a' && b[i] <= 'z') {
				b[i] -= 32;
			}
		}
		return readBytes;
	}
	
}
