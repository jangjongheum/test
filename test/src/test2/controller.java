package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class controller {
	static memberinfo mm= new memberinfo();
	static ArrayList<memberinfo> mi=new ArrayList<memberinfo>();
	public static void main(String[] args) {
		
	}

	public static void memberinsert() {
		mm=new memberinfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸� : ");
		mm.setName(sc.next());
		System.out.println("��ȣ : ");
		mm.setNum(sc.next());
		System.out.println("���� : ");
		mm.setGender(sc.next());
		mi.add(mm);
		System.out.println("�����߰� �Ϸ�");
	}

	public static void memberlist() {
		for(int i=0; i<mi.size(); i++) {
		mm=new memberinfo();
		System.out.println("�̸� : "+mi.get(i).getName());
		System.out.println("��ȣ : "+mi.get(i).getNum());
		System.out.println("���� : "+mi.get(i).getGender());
		System.out.println("-------------");
		}
	}

	public static void memberdelete() {
		mm=new memberinfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �̸��� �Է����ּ��� ");
		String name=sc.next();
		for(int i=0; i<mi.size(); i++) {
			if(mi.get(i).getName().equals(name)) {
				mi.remove(i);
				System.out.println("���������Ϸ�");
			}
		}
	}

	public static void memberserch() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�˻��� �̸��� �Է����ּ���");
		String name=sc.next();
		for(int i=0; i<mi.size(); i++) {
			mm=new memberinfo();
			if(mi.get(i).getName().equals(name)) {
				System.out.println("�̸� : "+mi.get(i).getName());
				System.out.println("��ȣ : "+mi.get(i).getNum());
				System.out.println("���� : "+mi.get(i).getGender());
				System.out.println("�����˻� �Ϸ�");
			}
		}
		
	}
}