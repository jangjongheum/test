package test2;

import java.util.ArrayList;

public class NumberBook {

	String name;
	String number;
	String gender;

	public static void main(String[] args) {
		NumberBook aa= new NumberBook();
		
		
		ArrayList<NumberBook> name=new ArrayList<NumberBook>();
		aa.name="����";
		aa.gender="��";
		aa.number="010-1111-1111";
		
		name.add(aa);
		System.out.println("�̸� : "+name.get(0).name);
		System.out.println("��ȣ : "+name.get(0).gender);
		System.out.println("���� : "+name.get(0).number);
		
	}

}
