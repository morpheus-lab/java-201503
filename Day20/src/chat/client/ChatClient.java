package chat.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ChatClient {
	
	public static void main(String[] args) {
		// Ű���� �Է� ��Ʈ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȭ���� �Է��ϼ���: ");
		String nick = sc.nextLine();
		
		Socket sock = null;
		
		try {
			// ���� �����ؼ� ����
			sock = new Socket("192.168.1.13", 3000);	// "127.0.0.1": loopback �ּ�
//			sock = new Socket("localhost", 3000);	// "localhost": loopback �ּ�
			
			// ����� ��Ʈ��
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			// ���� ���� �޽����� ��ȭ������ ����ϱ�� ������ ���
			out.write(nick + "\n");
			out.flush();
			
			MessageReceiver mr = new MessageReceiver(in);
			mr.start();
			
			while (true) {
				// Ű����κ��� �Է�, �������� ��������
				String msg = sc.nextLine();
				
				if (msg == null) break;
				
				out.write(msg + "\n");
				out.flush();
			}
		} catch (IOException e) {
		} catch (NoSuchElementException e) {
		} finally {
			// ���� �ݱ�
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
			sc.close();
		}
		
		System.out.println("������ ����Ǿ����ϴ�.");
	}
	
}

class MessageReceiver extends Thread {
	// �޽��� ���ſ� �Է� ��Ʈ��
	private BufferedReader in;
	
	public MessageReceiver(BufferedReader in) {
		this.in = in;
	}
	
	public void run() {
		try {
			while (true) {
				// �����κ��� �޽��� ����, ȭ�鿡 ���
				String msgFromServer = in.readLine();
				if (msgFromServer == null) {	// ���� ����
					break;
				}
				System.out.println(msgFromServer);
			}
		} catch (IOException e) {
		}
	}
}




















