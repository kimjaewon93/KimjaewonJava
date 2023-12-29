package org.Kimjaewon.day05.oop.run;

import java.util.Scanner;

import org.Kimjaewon.day05.oop.Book;
import org.Kimjaewon.day05.oop.Circle;
import org.Kimjaewon.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String[] args) {
//		Book book=new Book();
//		book.title="춘향뎐";
		
		Book book1= new Book("춘향뎐");
		
		
		System.out.printf("%s:%s\n",book1.title,"작자 미상");
		
//		book.title="어린왕자";
//		book.author="김재원";
		Book book2= new Book("어린왕자","김재원");
		System.out.printf("%s:%s\n",book2.title,book2.author);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc= new Scanner(System.in);
		Rectangle rect= new Rectangle();
		System.out.println("너비");
		rect.width=sc.nextInt();
		System.out.println("높이");
		rect.height=sc.nextInt();
		int result =rect.getArea();
		System.out.println("사각형의 넓이는" + result+ "입니다.");
		
		
		
		Circle pizza= new Circle();
		pizza.radius= 10;
		pizza.name= "청년피자";
		double area= pizza.getArea();
		System.out.println(pizza.name+ "의 면적은" +area);
	}
}
