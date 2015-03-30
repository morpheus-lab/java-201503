package socket.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ChatServer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
				String msgFromClient = in.readLine();
				if (msgFromClient.equals("bye")) {
					break;
				}
				System.out.println("Ŭ���̾�Ʈ> " + msgFromClient);
				
				// ���� �� ����ڷκ��� (Ű����)�Է¹��� �޽����� Ŭ���̾�Ʈ�� ����
				String msgFromServer = sc.nextLine();
				out.write(msgFromServer + "\n");
				out.flush();
			}
			
		} catch (IOException e) {	// ���Ͽ��� �߻�
		} catch (NoSuchElementException e) {	// ��ĳ�� ��ü���� �߻�
		} finally {
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
			if (ss != null)
				try {
					ss.close();
				} catch (IOException e) {}
			sc.close();
		}
		
		System.out.println("������ ����Ǿ����ϴ�.");
	}
	
}
