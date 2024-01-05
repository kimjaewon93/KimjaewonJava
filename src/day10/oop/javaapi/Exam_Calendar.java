package day10.oop.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today= Calendar.getInstance();
		 Calendar openDate= Calendar.getInstance();
		Calendar closeDate= Calendar.getInstance();
		
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH)+1+"월");
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
	//ystem.out.println(today.get(Calendar.
	//ystem.out.println(today.get(Calendar.YEAR));
		
		openDate.clear();
		//openDate.set();
	
	}
	public void printDate (String title,Calendar cal) {}
}
