package org.Kimjaewon.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While1 {
	public static void main(String[] args) {
		//while문을 이용하여 -1이 입력될때까지 정수를 입력받고
		//-1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc= new Scanner(System.in);
		//int i=0;
		int sum=0;
		while(true) {
			System.out.print("정수 입력 :");
			int input =sc.nextInt();
			if(input == -1) break;
			sum = sum +input;
			//i++;
		}
		System.out.println("입력하신 수의 합은"+ sum + "입니다");
	}

}
