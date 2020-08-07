package test2;

import java.util.ArrayList;

public class NumberBook {

	String name;
	String number;
	String gender;

	public static void main(String[] args) {
		NumberBook aa= new NumberBook();
		
		
		ArrayList<NumberBook> name=new ArrayList<NumberBook>();
		aa.name="종흠";
		aa.gender="남";
		aa.number="010-1111-1111";
		
		name.add(aa);
		System.out.println("이름 : "+name.get(0).name);
		System.out.println("번호 : "+name.get(0).gender);
		System.out.println("성별 : "+name.get(0).number);
		
	}

}
