package org.Kimjaewon.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_if3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요: ");
		int score= sc.nextInt();
		//모델 방식
		char grade;
		
		
		
		if (score <101) {
			
			if ( score >= 90) {
				grade='A';
				//System.out.println("학점은 A입니다.");
			}else if(score >= 80) {
				grade='B';
				//System.out.println("학점은 B입니다.");
			}else if(score >= 70) {
				grade='C';
				//System.out.println("학점은 C입니다.");
			}else if(score >= 60) {
				grade='D';
				//System.out.println("학점은 D입니다.");
			}else {
				grade='F';
				//System.out.println("학점은 F입니다.");				
								}
			System.out.println("학점은"+grade+"입니다" );
		}else {
			System.out.println("0~100 사이의 수를 입력해주세요");
		}
		sc.close();
		//100~90 :A
		//89~80	 :B
		//79~70	 :C
		//69~60  :D
		//60미만 :F
	
	}

}
