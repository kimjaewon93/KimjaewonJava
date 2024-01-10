package day13.soket.calculator;

import java.net.*;
import java.io.*;

public class CalcServer {

		public static void main(String[] args) {
			ServerSocket serverSocket= null;
			int port= 8888;
			InputStream is = null;
			try {
				serverSocket= new ServerSocket(port);
				System.out.println("클라이언트의 연결을 기다리고있습니다");
				Socket socket = serverSocket.accept();
				System.out.println("연결이 완료되었습니다"); //서버 소켓 만들어짐
			//	is= new FileInputStream(""); //생성해서 쓰는게 아니라
				is=socket.getInputStream(); //socket 객체 내의 스트림을 사용함
				int readByteCount;
				byte [] readBytes=new byte[1024];
				String result="";
				while((readByteCount= is.read(readBytes)) != -1) {
					result += new String(readBytes,0,readByteCount);
				}
				System.out.println(result);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
