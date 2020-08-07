package test2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1. 멤버추가 2. 전체출력 3. 멤버삭제 4. 멤버검색  5. 종료하기");
		switch(sc.next()) {
		
		case "1":
			System.out.println("멤버추가");
			System.out.println("--------------");
			controller.memberinsert(); 
			break;
		case "2":
			System.out.println("전체출력");
			System.out.println("--------------");
			controller.memberlist();
			break;
		case "3":
			System.out.println("멤버삭제");
			System.out.println("--------------");
			controller.memberdelete();
			break;
		case "4":
			System.out.println("멤버검색");
			controller.memberserch();
			break;
		case "5":
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		default:
			System.out.println("번호를 다시입력해주세요");
		}
		
	}

	}
}
