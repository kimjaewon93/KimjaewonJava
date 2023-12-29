package org.Kimjaewon.day06.score;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		finish:
		while(true) {
			System.out.println("=======메인메뉴========");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.println("선택");
			int choice=sc.nextInt();//번호로 메뉴선택값을 입력받음
			
			int kor=0;
			int eng=0;
			int math=0;
			case1 안에서 선언된 변수는		
					
			switch(choice) {
			case 1:System.out.println("========성적 입력======");
			System.out.println("국어: ");
			int kor=sc.nextInt();
			System.out.println("영어: ");
			int eng=sc.nextInt();
			System.out.println("수학: ");
			int math=sc.nextInt();
			break;
			
			
			case 2:
			kor=0;
			eng=0;
			math=0;	
			System.out.println("====성적 출력========"); 
			System.out.println("국어: " +kor);
			int kor=sc.nextInt();
			System.out.println("영어: " +eng);
			int eng=sc.nextInt();
			System.out.println("수학: "+ math);
			int math=sc.nextInt();
			break;
			
			case 3:System.out.println("프로그램이 종료되었습니다."); break finish;
			default:System.out.println("1~3 사이의 숫자를 입력해주세요."); break;
			}			
		}
		
	}
}
