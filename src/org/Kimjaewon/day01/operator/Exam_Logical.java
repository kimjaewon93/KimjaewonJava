package org.Kimjaewon.day01.operator;

public class Exam_Logical {
	public static void main(String[] args) {
		//논리연산자 예제
		//Oracle에서 WHERE절 뒤에 적었던 논리연산자 AND, OR
		//와 같은 연락을 함
		//EX) 남자이면서 평균평점 4.3이상인 사람
		//	  컴퓨터공학과 또는 경영학과인 사람
		boolean result1, result2, result3, result4;
		//boolean result2
		//boolean result3
		//boolean result4
		//num1 cannot be resolved to a variable
		int num1= 50;
		int num2= 30;
		result1= (num1==num2) && (num1 < num2);
		result2= (num1 < num2) || (num1== num2);
		result3= (num1 > num2) && (num1 != num2);
		result4= (num1 > num2) || (num1 == num2);
		//result1의 결과값: ?
		//result2의 결과값: ?
		//result3의 결과값: ?
		//result4의 결과값: ?
		
		//&& and 연산자 둘다 같아야한다
		// || or 연산자 둘중하나만 참이어도 참
		// != 같지 않다 
		
		// a는 70, b는 55다.
		//result1= (a==b) || (a++ <100); t
		//a=71 b=55
		//result2= (a<b) && (--b < 55); f
		//a=71 b=54
		//resilt3= (a!=b) && (b-- < a++); t
		//a=72 b=53
		//result4 (a++ !=b) || (b++ >= 85);t
		//a=73 54
		
		//a : ?  , b: ?
		
	}
}
