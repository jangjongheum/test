package test2;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.�� 2.�б� 3.ȸ�� �� �ϳ��� ����");
		switch(sc.next()){//sc.next()�� ��ĳ���� �����ִ� ��
		case "1":
			System.out.println("���� �����ϼ̽��ϴ�.");
			break;
		case "2":
			System.out.println("�б��� �����ϼ̽��ϴ�.");
			break;
		case "3":
			System.out.println("ȸ�縦 �����ϼ̽��ϴ�.");
			break;
			
		default:
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			}
		System.out.println(" ");
		}
	}

}
