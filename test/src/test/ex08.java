
package test;

import java.util.ArrayList;

public class ex08 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("현준이형");
		arr.add("예림이누나");
		arr.add("지원이");
		arr.add("종흠이");
		
		System.out.println(arr.get(0));
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
