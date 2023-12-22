package org.Kimjaewon.day01.operator;

public class Exam_Unary {
	public static void main(String[] args) {
		//단항 연산자
		//a++, ++a -> a =a + 1;
		//후위연산, 전위연산
		int a1=1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 문제1
		// a가 10, b는 20, c는 30
		// a++;
		// a : 11, b : 20 , c : 30
		// b = (--a) + b;
		// a : ?, b : ?, c : 30
		// c = (a++) + (--b);
		// a : ?, b : ?, c : ?
		
		// 문제2
		// x는 100, y는 33, z는 0
		// x--;
		// z = x-- + --y;
		// x = 99 + x++ + x;
		// y = y-- + y + ++y;
		// x : ?, y : ?, z : ?
		
		//x= 98
		//x= 99 + x++ + x =?  
		//x= 99 + 98 + 99
		//왜 99가 되냐면 후위연산자는 끝나자마자 진행된다 순서대로 산술

		System.out.println();
	}
}
