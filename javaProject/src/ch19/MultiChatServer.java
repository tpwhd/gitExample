package ch19;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

public class MultiChatServer {
	HashMap userMap;
	
	public MultiChatServer() {
		userMap = new HashMap<>();
		Collections.synchronizedMap(userMap);
	}
	
	public static void main(String[] args) {
		new ServerScreen(); //화면만 띄움
		new MultiChatServer().serviceStart(); //서비스 개시 용도
		
	}

	private void serviceStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.err.println("서버가 시작되었습니다.");
			while(true) {
				socket = serverSocket.accept(); //접속대기상태
				System.out.println("[" + socket.getInetAddress() + "]" + 
				"에서 접속하셨습니다");
				//클라이언트별로 메시지 수신을 위한 스레드 생성
				//10명이 접속하면 10개의 스레드가 생성됨(속도는 약간 느려짐)
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
