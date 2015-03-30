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
			ss = new ServerSocket(3000);	// 서버 소켓 생성
			sock = ss.accept();	// 클라이언트 연결 요청 대기
			
			// 클라이언트와 연결됨
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			
			while (true) {
				// 데이터 읽고
				String msgFromClient = in.readLine();
				if (msgFromClient.equals("bye")) {
					break;
				}
				System.out.println("클라이언트> " + msgFromClient);
				
				// 서버 측 사용자로부터 (키보드)입력받은 메시지를 클라이언트에 전송
				String msgFromServer = sc.nextLine();
				out.write(msgFromServer + "\n");
				out.flush();
			}
			
		} catch (IOException e) {	// 소켓에서 발생
		} catch (NoSuchElementException e) {	// 스캐너 객체에서 발생
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
		
		System.out.println("접속이 종료되었습니다.");
	}
	
}
