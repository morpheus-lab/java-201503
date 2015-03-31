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
				WorkerThread wt = new WorkerThread(sock);	// 어느 한 클라이언트와 연결된 객체
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
	
	// 이 쓰레드와 연결된 클라이언트에게 메시지 전송
	public void sendMessage(String message, String sender) throws IOException {
		if (sender != null)
			out.write(sender + "> " + message + "\n");
		else
			out.write("*** " + message + " ***\n");
		out.flush();
	}
	
	public void run() {
		try {
			// 입출력 스트림 생성
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			
			// 대화명 수신 후 처리
			nick = in.readLine();
			
			System.out.println(nick + "님 접속");
			
			synchronized (ChatServer.CLIENTS) {
				ChatServer.CLIENTS.add(this);
				
				// 접속 알림
				for (WorkerThread wt : ChatServer.CLIENTS) {
					wt.sendMessage(this.nick + "님이 접속하였습니다.", null);
				}
			}
			
			// 반복해서
			while (true) {
				// 메시지 수신
				String msg = in.readLine();
				
				if (msg == null)	// 접속 종료된 경우
					break;	// 반복문 끝내고 쓰레드 종료되도록
				
				// 모든 클라이언트에 수신한 메시지 전송
				synchronized (ChatServer.CLIENTS) {
					for (WorkerThread wt : ChatServer.CLIENTS) {
						wt.sendMessage(msg, this.nick);
					}
				}
			}
		} catch (IOException e) {
		} finally {
			synchronized (ChatServer.CLIENTS) {
				ChatServer.CLIENTS.remove(this);	// 클라이언트 목록으로부터 제거
			}
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
			System.out.println(nick + "님 접속 종료");
		}
	}
}
























