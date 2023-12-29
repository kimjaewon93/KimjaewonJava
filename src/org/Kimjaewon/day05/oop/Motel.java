package org.Kimjaewon.day05.oop;

import java.util.Scanner;

public class Motel {
	public static void main(String[] args) {
		MotelRoom rooms[] = new [10];
	
		Scanner sc= new Scanner(System.in);
		
		for(int i = 0; i < rooms.length; i++) {
			rooms[i] = new MotelRoom('N', i + 1);
		}
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.println("1.입실 2.퇴실 3.방보기 4.종료");
	
	}

}
