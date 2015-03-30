package socket.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EchoClient {
	
	public static void main(String[] args) {
		// Ű���� �Է� ��Ʈ��
		Scanner sc = new Scanner(System.in);
		
		Socket sock = null;
		
		try {
			// ���� �����ؼ� ����
			sock = new Socket("127.0.0.1", 3000);	// "127.0.0.1": loopback �ּ�
//			sock = new Socket("localhost", 3000);	// "localhost": loopback �ּ�
			
			// ����� ��Ʈ��
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			while (true) {
				// Ű����κ��� �Է�, �������� ��������
				String msg = sc.nextLine();
				
				if (msg == null) break;
				
				out.write(msg + "\n");
				out.flush();
				// �����κ��� �޽��� ����, ȭ�鿡 ���
				String msgFromServer = in.readLine();
				System.out.println(msgFromServer);
			}
		} catch (IOException e) {
		} catch (NoSuchElementException e) {
		} finally {
			// ���� �ݱ�
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
		}
		
	}
	
}
