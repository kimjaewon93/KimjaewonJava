package org.Kimjaewon.day02.loop.exercise;

public class Exercise_For1 {
	public static void main(String[] args) {
		//1부터 10까지의 덧셈을 표시하고 합도 구하시오
		//1+2+3+4+5+6+7+8+9+10=55
		int sum= 0;
		for(int i=1; i<=10; i++) {
			sum = sum+ i;
			if( i<=9)
			System.out.print(i+"+");
			else
			System.out.print(i + "=");
		}
			System.out.println(sum);
	}
}
//조건따지고  맞으면 실행하고 증가 
//틀리면 그냥 증가
	
	 