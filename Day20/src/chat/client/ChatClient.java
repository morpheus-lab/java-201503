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
		// 키보드 입력 스트림
		Scanner sc = new Scanner(System.in);
		
		System.out.print("대화명을 입력하세요: ");
		String nick = sc.nextLine();
		
		Socket sock = null;
		
		try {
			// 소켓 생성해서 연결
			sock = new Socket("192.168.1.13", 3000);	// "127.0.0.1": loopback 주소
//			sock = new Socket("localhost", 3000);	// "localhost": loopback 주소
			
			// 입출력 스트림
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			// 최초 전송 메시지를 대화명으로 사용하기로 서버와 약속
			out.write(nick + "\n");
			out.flush();
			
			MessageReceiver mr = new MessageReceiver(in);
			mr.start();
			
			while (true) {
				// 키보드로부터 입력, 소켓으로 내보내고
				String msg = sc.nextLine();
				
				if (msg == null) break;
				
				out.write(msg + "\n");
				out.flush();
			}
		} catch (IOException e) {
		} catch (NoSuchElementException e) {
		} finally {
			// 소켓 닫기
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
			sc.close();
		}
		
		System.out.println("접속이 종료되었습니다.");
	}
	
}

class MessageReceiver extends Thread {
	// 메시지 수신용 입력 스트림
	private BufferedReader in;
	
	public MessageReceiver(BufferedReader in) {
		this.in = in;
	}
	
	public void run() {
		try {
			while (true) {
				// 서버로부터 메시지 수신, 화면에 출력
				String msgFromServer = in.readLine();
				if (msgFromServer == null) {	// 접속 끊김
					break;
				}
				System.out.println(msgFromServer);
			}
		} catch (IOException e) {
		}
	}
}




















