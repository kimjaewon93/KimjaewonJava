package org.Kimjaewon.day06.oops.Student;

import java.util.Scanner;

public class StudentApp {
    static Student students [] = new Student[3];

    public static void main(String[] args) {
        끝 :
        while(true) {
            int choice = printMenu();
            switch(choice) {
            case 1 : inputScore(); break;
            case 2 : printScore(); break;
            case 3 : displayMsg("프로그램이 종료되었습니다."); break 끝;
            default : displayMsg("1 ~ 3사이의 숫자를 입력해주세요."); break;
            }
        }
    }
    public static void inputScore() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("이름 : ");
            students[i].name = sc.next();
            System.out.print("1번째 점수 : ");
            students[i].firstScore = sc.nextInt();
            System.out.print("2번째 점수 : ");
            students[i].secondScore = sc.nextInt();
        }
    }
    public static void printScore() {
        for(int i = 0; i < students.length; i++) {
            System.out.println((i+1) +"번째 학생 정보 출력");
            System.out.printf("%s 학생의 점수는 1차 : %d점, 2차 : %d점입니다.\n"
                        ,students[i].name ,students[i].firstScore ,students[i].secondScore);
        }
    }
    public static void displayMsg(String msg) {
        System.out.println(msg);
    }
    public static int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== 메인 메뉴 ======");
        System.out.println("1. 성적입력");
        System.out.println("2. 성적출력");
        System.out.println("3. 종료");
        System.out.print("선택 : ");
        int choice = sc.nextInt();
        return choice;
    }
}