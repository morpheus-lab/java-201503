package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketExam {
	
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("www.naver.com", 80);
			// 접속 성공
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(client.getInputStream(), "UTF-8"));
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(client.getOutputStream()));
			
			out.write("GET / HTTP/1.0\r\n");	// 웹서버에 홈페이지 요청
			out.write("Host: www.naver.com\r\n");
			out.write("\r\n");
			out.write("\r\n");
			out.flush();
			
			String line = null;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (client != null) {
				try {
					client.close();
				} catch (IOException e) {}
			}
		}
		
	}
	
}
