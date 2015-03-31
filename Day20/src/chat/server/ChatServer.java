package chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	
	static List<WorkerThread> CLIENTS = new ArrayList<WorkerThread>();
	
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(3000);
			while (true) {
				Socket sock = ss.accept();
				WorkerThread wt = new WorkerThread(sock);	// ��� �� Ŭ���̾�Ʈ�� ����� ��ü
				wt.start();
			}
		} catch (IOException e) {
		}
	}
}

class WorkerThread extends Thread {
	private Socket sock;
	private BufferedWriter out;
	private String nick;
	
	public WorkerThread(Socket sock) {
		this.sock = sock;
	}
	
	// �� ������� ����� Ŭ���̾�Ʈ���� �޽��� ����
	public void sendMessage(String message, String sender) throws IOException {
		if (sender != null)
			out.write(sender + "> " + message + "\n");
		else
			out.write("*** " + message + " ***\n");
		out.flush();
	}
	
	public void run() {
		try {
			// ����� ��Ʈ�� ����
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			
			// ��ȭ�� ���� �� ó��
			nick = in.readLine();
			
			System.out.println(nick + "�� ����");
			
			synchronized (ChatServer.CLIENTS) {
				ChatServer.CLIENTS.add(this);
				
				// ���� �˸�
				for (WorkerThread wt : ChatServer.CLIENTS) {
					wt.sendMessage(this.nick + "���� �����Ͽ����ϴ�.", null);
				}
			}
			
			// �ݺ��ؼ�
			while (true) {
				// �޽��� ����
				String msg = in.readLine();
				
				if (msg == null)	// ���� ����� ���
					break;	// �ݺ��� ������ ������ ����ǵ���
				
				// ��� Ŭ���̾�Ʈ�� ������ �޽��� ����
				synchronized (ChatServer.CLIENTS) {
					for (WorkerThread wt : ChatServer.CLIENTS) {
						wt.sendMessage(msg, this.nick);
					}
				}
			}
		} catch (IOException e) {
		} finally {
			synchronized (ChatServer.CLIENTS) {
				ChatServer.CLIENTS.remove(this);	// Ŭ���̾�Ʈ ������κ��� ����
			}
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
			System.out.println(nick + "�� ���� ����");
		}
	}
}
























