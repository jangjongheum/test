package test2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1. ����߰� 2. ��ü��� 3. ������� 4. ����˻�  5. �����ϱ�");
		switch(sc.next()) {
		
		case "1":
			System.out.println("����߰�");
			System.out.println("--------------");
			controller.memberinsert(); 
			break;
		case "2":
			System.out.println("��ü���");
			System.out.println("--------------");
			controller.memberlist();
			break;
		case "3":
			System.out.println("�������");
			System.out.println("--------------");
			controller.memberdelete();
			break;
		case "4":
			System.out.println("����˻�");
			controller.memberserch();
			break;
		case "5":
			System.out.println("���α׷��� �����մϴ�");
			System.exit(0);
		default:
			System.out.println("��ȣ�� �ٽ��Է����ּ���");
		}
		
	}

	}
}
