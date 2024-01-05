package day10.oop.javaapi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_Date {
	public static void main(String[] args) {
		Date date= new Date();
		System.out.println(date);
		SimpleDateFormat trans= new SimpleDateFormat("yyyy/mm/dd HH:MM:SS");
		SimpleDateFormat trans2=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String transDate1=trans.format(date);
		String transDate2=trans2.format(date);
		
		System.out.println("형식 변환1: " + transDate1);
		System.out.println("형식 변환2: " + transDate2);
		//========================권장사항============
		Calendar calendar= new gregorianCalendar();//업캐스팅
		System.out.println(calendar.getTime());
		String changed=trans2.format(calendar.getTime());
	}

}
