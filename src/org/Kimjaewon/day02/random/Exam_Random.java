package org.Kimjaewon.day02.random;

import java.util.Random;
//import java.util.Scanner;

public class Exam_Random {
	public static void main(String[] args) {
		Random rand = new Random();
		//0부터 n-1 까지의 랜덤한 수 리턴!
		//0부터 9까지   System.out.println(rand.nextInt(10));
		//1부터 10까지   System.out.println(rand.nextInt(10)+1);
		//25부터 35사이의 랜덤한 수 출력하기 위한
		// -25 -25
		//0 부터 10사이의 랜덤한수 출력
		System.out.println(rand.nextInt(11)+25);
		
	}

}
