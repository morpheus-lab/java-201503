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
			ss = new ServerSocket(3000);	// 서버 소켓 생성
			sock = ss.accept();	// 클라이언트 연결 요청 대기
			
			// 클라이언트와 연결됨
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			
			while (true) {
				// 데이터 읽고
				String data = in.readLine();
				System.out.println("클라이언트> " + data);
				// 읽은 데이터 그대로 내보내기
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
