package socket.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientEchoServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(3000);	// 서버 소켓 생성
			while (true) {
				Socket sock = ss.accept();	// 클라이언트 연결 요청 대기
				EchoWorker worker = new EchoWorker(sock);
				worker.start();
			}
		} catch (IOException e) {
		} finally {
			if (ss != null)
				try {
					ss.close();
				} catch (IOException e) {}
		}
	}
}

class EchoWorker extends Thread {
	private Socket sock;
	
	public EchoWorker(Socket sock) {
		this.sock = sock;
	}
	
	public void run() {
		if (sock == null)
			return;
		
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream()));
			
			while (true) {
				String msgFromClient = in.readLine();
				if (msgFromClient == null) break;
				out.write(msgFromClient + "\n");
				out.flush();
			}
		} catch (IOException e) {
		} finally {
			if (sock != null)
				try {
					sock.close();
				} catch (IOException e) {}
		}
	}
}































