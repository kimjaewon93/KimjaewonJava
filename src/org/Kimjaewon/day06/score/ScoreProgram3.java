package org.Kimjaewon.day06.score;

import java.util.Scanner;

public class ScoreProgram3 {
	 int kor;
	 int eng;
	 int math;
	public  void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		end:
		while(true) {
			int choice=printMenu();
			switch(choice) {
				case 1: inputScore();break;
				case 2: printScore();break;
				case 3: displayMsg("프로그램이 종료되었습니다");break
				default: displayMsg("1~3 사이의 수를 입력해주세요");break
			}
		}
	}
	public  int printMenu {
		Scanner sc= new Scanner(System.in);
		System.out.println("=========메인 메뉴=========");
		System.out.println("1. 성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.print("선택 : ");
		int choice=sc.nextInt();
		return choice;
	}
	public  int inputScore() {
		Scanner sc= new Scanner(System.in);
		System.out.println("=======성적 입력=======");
		System.out.print("국어: ");
		kor=sc.nextInt();
		System.out.print("영어 : ");
		eng=sc.nextInt();
		System.out.print("수학 : ");
		math=sc.nextInt();
		
}
