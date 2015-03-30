package socket.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sock = null;
		try {
			ss = new ServerSocket(3000);	// ���� ���� ����
			sock = ss.accept();	// Ŭ���̾�Ʈ ���� ��û ���
			
			// Ŭ���̾�Ʈ�� �����
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			
			while (true) {
				// ������ �а�
				String data = in.readLine();
				System.out.println("Ŭ���̾�Ʈ> " + data);
				// ���� ������ �״�� ��������
				out.write(data + "\n");
				out.flush();
			}
			
		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
			if (ss != null)
				try {
					ss.close();
				} catch (IOException e) {}
		}
		
	}
	
}
