package test2;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.집 2.학교 3.회사 중 하나를 선택");
		switch(sc.next()){//sc.next()는 스캐너의 적어주는 값
		case "1":
			System.out.println("집을 선택하셨습니다.");
			break;
		case "2":
			System.out.println("학교를 선택하셨습니다.");
			break;
		case "3":
			System.out.println("회사를 선택하셨습니다.");
			break;
			
		default:
			System.out.println("잘못 선택하셨습니다.");
			}
		System.out.println(" ");
		}
	}

}
