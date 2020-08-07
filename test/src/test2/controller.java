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
		System.out.println("이름 : ");
		mm.setName(sc.next());
		System.out.println("번호 : ");
		mm.setNum(sc.next());
		System.out.println("성별 : ");
		mm.setGender(sc.next());
		mi.add(mm);
		System.out.println("정보추가 완료");
	}

	public static void memberlist() {
		for(int i=0; i<mi.size(); i++) {
		mm=new memberinfo();
		System.out.println("이름 : "+mi.get(i).getName());
		System.out.println("번호 : "+mi.get(i).getNum());
		System.out.println("성별 : "+mi.get(i).getGender());
		System.out.println("-------------");
		}
	}

	public static void memberdelete() {
		mm=new memberinfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제할 이름을 입력해주세요 ");
		String name=sc.next();
		for(int i=0; i<mi.size(); i++) {
			if(mi.get(i).getName().equals(name)) {
				mi.remove(i);
				System.out.println("정보삭제완료");
			}
		}
	}

	public static void memberserch() {
		Scanner sc=new Scanner(System.in);
		System.out.println("검색할 이름을 입력해주세요");
		String name=sc.next();
		for(int i=0; i<mi.size(); i++) {
			mm=new memberinfo();
			if(mi.get(i).getName().equals(name)) {
				System.out.println("이름 : "+mi.get(i).getName());
				System.out.println("번호 : "+mi.get(i).getNum());
				System.out.println("성별 : "+mi.get(i).getGender());
				System.out.println("정보검색 완료");
			}
		}
		
	}
}