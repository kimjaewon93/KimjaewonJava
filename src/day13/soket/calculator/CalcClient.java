package day13.soket.calculator;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class CalcClient {
	public static void main(String[] args) {
		String address= "127.0.0.1";
		int port=8888;
		Scanner sc= new Scanner(System.in);
		OutputStream os=null;
		
		try {
			//계산식 (빈칸으로 띄워 입력, 예 24+42 >>24+42
			Socket socket=new Socket(address,port);
			System.out.println("서버와의 연결이 완료되었습니다"); //클라의 소켓이 만들어짐
			//os=new FileOutStream(""); //이렇게 쓰면 안됨 내가 직접객체 생성해서 쓰는것이 아니라 
			os= socket.getOutputStream(); //소켓의 출력스트림을 사용해야함
			System.out.println("계산식(빈칸으로 띄워 입력, 예 24+42) >>");
			String sendMsg=sc.nextLine();
			byte[] readBytes=sendMsg.getBytes();
			os.write(readBytes);
			os.flush();
			} catch ( UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
			} catch ( IOException e) {
				// TODO: handle exception
				e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
