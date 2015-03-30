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
		// 키보드 입력 스트림
		Scanner sc = new Scanner(System.in);
		
		Socket sock = null;
		
		try {
			// 소켓 생성해서 연결
			sock = new Socket("127.0.0.1", 3000);	// "127.0.0.1": loopback 주소
//			sock = new Socket("localhost", 3000);	// "localhost": loopback 주소
			
			// 입출력 스트림
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			while (true) {
				// 키보드로부터 입력, 소켓으로 내보내고
				String msg = sc.nextLine();
				
				if (msg == null) break;
				
				out.write(msg + "\n");
				out.flush();
				// 서버로부터 메시지 수신, 화면에 출력
				String msgFromServer = in.readLine();
				System.out.println(msgFromServer);
			}
		} catch (IOException e) {
		} catch (NoSuchElementException e) {
		} finally {
			// 소켓 닫기
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
		}
		
	}
	
}
