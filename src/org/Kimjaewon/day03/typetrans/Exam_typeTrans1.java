package org.Kimjaewon.day03.typetrans;

public class Exam_typeTrans1 {
		public static void main(String[] args) {
			//형변환
			//컴퓨터에서 연산은 원칙적으로 같은 자료형끼리 계산하여
			//해당 자료형으로 결과가 나옴
			//정수/정수 = 정수, 정수*정수= 정수
			// ex) 36(36.0) / 5(5.0) = 7 (7.2)
			//강제형변환 / 자동형변환
			int iNum=10;
			double dNum= 3.14;
			double result= dNum/iNum; // 3.14/10(10.0) 자동형변환
			System.out.println("result: "+ result);
			//자동형변환의 방향은 더 큰쪽으로 자동으로 변환됨.
			
			byte bNum=127;
			int iNum= 100;
			int iNum2= 10;
			double dNum= 4.0;
			
			//자동 형변환
			//byte -> int, int -> double
			System.out.println(bNum + iNum);
			System.out.println(iNum2 / dNum);
			//강제 형변환
			System.out.println((byte)(bNum+iNum));
			System.out.println((int)2.9 +1.8);
			System.out.println((int)(2.9+1.8));
			System.out.println((int)2.9+ (int)1.8);
			
//			System.out.println("강제 형변환1");
//			System.out.println("result: " + (int)result);
//			System.out.println("강제 형변환2: " + (char)65);
		}
}
