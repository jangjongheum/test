package test2;

import java.util.HashMap;

public class ex03 {

	public static void main(String[] args) {
		HashMap<String, String> name=new HashMap<String, String>();
		HashMap<String, String> point=new HashMap<String, String>();
		
		name.put("ù��°", "����");
		name.put("�ι�°", "����");
		
		point.put("����", "80��");
		point.put("����", "70��");
		point.put("����", "90��");
		point.put("��ȸ", "65��");
		
		System.out.println("�̸� = "+name.get("ù��°"));
		System.out.println("����������"+point.get("����"));
		System.out.println("����������"+point.get("����"));
		
		
	}

}
