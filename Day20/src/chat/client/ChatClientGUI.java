package chat.client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI
	implements	ActionListener,	// ���� GUI ������Ʈ(��ư ���)���� Ŭ�� ���� �۵��� ������ ��,
								// �׿� ���� ó���� �� �� �ֵ���
				Runnable	// �����κ��� �޽��� �����ϰ� ���� â�� ǥ��
{
	
	// ä�� ���� �ּ�
	private String serverIpAddr = "192.168.1.13";
	
	// ä�� ���� ��Ʈ ��ȣ
	private int port = 3000;
	
	// ����
	private Socket sock;
	
	// ����� ��Ʈ��
	private BufferedReader in;
	private PrintWriter out;
	
	// GUI ������
	private JFrame window;
	
	// �α��� �� ��ܿ� �� JPanel
	private JPanel loginPanel;
	private JLabel nickLabel;	// JLabel�� �ؽ�Ʈ �Ǵ� �̹����� ǥ���ϴ� ������Ʈ
	private JTextField nickTextField;	// JTextField�� �ؽ�Ʈ�� �Է� �ްų� ǥ���ϴ� ������Ʈ
	private JButton loginButton;	// JButton�� Ŭ���� �� �ִ� ��ư
	
	// ���� �޽��� ���
	private JTextArea recvTextArea;
	
	// �޽��� �Է� �г�
	private JPanel msgInputPanel;
	private JTextField msgTextField;
	private JButton exitButton;
	
	public ChatClientGUI() {
		// loginPanel ����
		loginPanel = new JPanel();
		loginPanel.setLayout(new BorderLayout());	// ���̾ƿ� ����
		// loginPanel ���� ������Ʈ ����
		nickLabel = new JLabel(" ��ȭ��: ");
		nickTextField = new JTextField(15);
		loginButton = new JButton("�α���");
		loginButton.addActionListener(this);	// �α��� ��ư�� �߻��� �̺�Ʈ�� this ��ü�� �˷���
		// loginPanel ���� ������Ʈ���� loginPanel ���ο� ��ġ
		loginPanel.add(nickLabel, BorderLayout.WEST);
		loginPanel.add(nickTextField, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		// ���� �޽��� ���
		recvTextArea = new JTextArea("", 10, 30);
		recvTextArea.setEditable(false);
		// ��ũ�� �ٰ� ǥ�õǵ��� JScrollPane ��ü�� JTextArea ��ü ������
		JScrollPane jsp = new JScrollPane(recvTextArea,
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
									JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		// �޽��� �Է� �г�
		msgInputPanel = new JPanel();
		msgInputPanel.setLayout(new BorderLayout());
		// ���ο� �� ������Ʈ ����
		msgTextField = new JTextField(30);
		msgTextField.addActionListener(this);
//		msgTextField.setEnabled(false);	// �޽��� �Է� ����
		exitButton = new JButton("����");
		exitButton.addActionListener(this);	// �� ��ư�� �̺�Ʈ(Ŭ�� ���)�� �߻��ϸ� this��ü���� �˷���
		// msgInputPanel�� ���� ������Ʈ ��ġ
		msgInputPanel.add(msgTextField, BorderLayout.CENTER);
		msgInputPanel.add(exitButton, BorderLayout.EAST);
		
		// Ŭ���̾�Ʈ ������
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("::ä�� Ŭ���̾�Ʈ::");
		window.setSize(480, 320);
		window.setLayout(new BorderLayout());	// window�� BorderLayout�� �����ϴ� ����� ����
												// ���� ������Ʈ�� ��ġ �� ����
		// ���� ������Ʈ ��ġ
		window.add(loginPanel, BorderLayout.NORTH);
		window.add(jsp, BorderLayout.CENTER);
		window.add(msgInputPanel, BorderLayout.SOUTH);
		
		window.setVisible(true);
	}
	
	@Override	// from ActionListener
	public void actionPerformed(ActionEvent e) {
		// � ��ư �Ǵ� � ������Ʈ�� �̺�Ʈ�� �߻��߳�?
		Object eventSource = e.getSource();
		
		if (eventSource == exitButton) {	// �����ư�� �������� ��
			System.exit(0);	// ���α׷� ����
		}
		else if (eventSource == loginButton) {	// �α��� ��ư�� �������� ��
			try {
				// ������ ����
				connect();
				
				// ��ȭ�� ���� ���ϵ���
				nickTextField.setEditable(false);
				
				// �α��� ��ư Ŭ�� ���ϵ���
				loginButton.setEnabled(false);
				
				// �޽��� �Է� �ؽ�Ʈ �ʵ� Ȱ��ȭ
//				msgTextField.setEnabled(true);
				
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				if (e1.getMessage().equals("��ȭ�� �ߺ�")) {
					recvTextArea.append("����� �� ���� ��ȭ���Դϴ�. �ٸ� ��ȭ���� ����ϼ���.\n");
					recvTextArea.setCaretPosition(recvTextArea.getDocument().getLength());
				}
			}
			
		}
		else if (eventSource == msgTextField) {	// ��ȭ �Է� �ʵ忡�� ���Ͱ� �Էµ��� ��
			// ������ ���ӵǾ� �ִ��� Ȯ��
			if (sock != null) {
				// ������ �޽��� ������
				out.println(msgTextField.getText());
				// ��ȭ �Է� �ʵ� ����
				msgTextField.setText("");
			}
		}
	}
	
	@Override	// from Runnable
	public void run() {
		boolean recvThreadRunning = true;
		// �޽��� ���� �ݺ�
		while (recvThreadRunning) {
			try {
				String msg = in.readLine();	// �޽��� ����
				recvTextArea.append(msg + "\n");
				
				// Ŀ���� �� �ڷ� ���� => �ڵ� ��ũ�� ���ؼ�
				recvTextArea.setCaretPosition(recvTextArea.getDocument().getLength());
			} catch (IOException e) {
				recvThreadRunning = false;
				e.printStackTrace();
			}
		}
	}
	
	private void connect() throws IOException, Exception {
		// ä�� ������ ����
		sock = new Socket(serverIpAddr, port);
		
		// ����� ��Ʈ�� ����
		in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		out = new PrintWriter(sock.getOutputStream(), true);
		
		// ��ȭ�� ����
		out.println(nickTextField.getText());
		
		// �޽��� ������ ���� ������ ���� �� ����
		Thread t = new Thread(this);
		t.start();
	}
	
	public static void main(String[] args) {
		
		new ChatClientGUI();
		
	}
	
}
