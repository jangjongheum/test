
package test;

import java.util.ArrayList;

public class ex08 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("��������");
		arr.add("�����̴���");
		arr.add("������");
		arr.add("������");
		
		System.out.println(arr.get(0));
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
