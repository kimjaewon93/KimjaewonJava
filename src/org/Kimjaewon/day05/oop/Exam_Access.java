package org.Kimjaewon.day05.oop;
//접근지정자(제한자)
//종류 : public, protected, default, private
class Sample{
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String[] args) {
		Sample smpl= new Sample();
		smpl.a=1113;
		//smpl.b=426; //보이지 않아요private
		smpl.c=1026;
	
	
	}
}
