package day13.soket.basic;

import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) {
		String address= "127.0.0.1";
		int port= 8888;
		try {
			Socket socket= new Socket(address, port);
			System.out.println("서버와 연결되었씁니다.");
			
		} catch (UnknownHostException e) {
			// TODO: handle exception
		}
		
	}
}
