package test2;

import java.util.HashMap;

public class ex03 {

	public static void main(String[] args) {
		HashMap<String, String> name=new HashMap<String, String>();
		HashMap<String, String> point=new HashMap<String, String>();
		
		name.put("첫번째", "종흠");
		name.put("두번째", "지원");
		
		point.put("국어", "80점");
		point.put("수학", "70점");
		point.put("영어", "90점");
		point.put("사회", "65점");
		
		System.out.println("이름 = "+name.get("첫번째"));
		System.out.println("국어점수는"+point.get("국어"));
		System.out.println("영어점수는"+point.get("영어"));
		
		
	}

}
