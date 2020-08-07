package test2;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("종흠");
		arr.add("지원");
		arr.add("현준이형");
		arr.add("예림이누나");
		
		System.out.println(arr.get(0));
		
		for(int i=0; i<arr.size(); i++) {
			
			System.out.println("Array의"+(i+1)+"번쨰 값 : "+arr.get(i));
		}
	}

}
