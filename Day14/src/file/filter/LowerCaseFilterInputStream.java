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
		// data�� �ҹ����̸�, �빮�ڷ� ��ȯ
		if (data >= 'a' && data <= 'z') {
			data -= 32;
		}
		return data;
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int readBytes = super.read(b, off, len);
		// off �ε��� ~ off + readBytes - 1 �ε��� �����Ϳ� ���� �ҹ��� �˻�
		for (int i = off; i < off + readBytes; i++) {
			// b[i] �� �ҹ����̸� �빮�ڷ� ��ȯ
			if (b[i] >= 'a' && b[i] <= 'z') {
				b[i] -= 32;
			}
		}
		return readBytes;
	}
	
}
