package test2;

import java.util.ArrayList;
import java.util.HashMap;

public class ex05 {

	public static void main(String[] args) {
		ArrayList<Integer> one=new ArrayList<Integer>();
		int a;
		for(a=1; a<10; a++) {
			one.add(2*a);
		}
		ArrayList<Integer> two=new ArrayList<Integer>();
		int b;
		for(b=1; b<10; b++) {
			two.add(3*b);
		}
		ArrayList<Integer> three=new ArrayList<Integer>();
		int c;
		for(c=1; c<10; c++) {
			three.add(4*c);
		}
		ArrayList<Integer> four=new ArrayList<Integer>();
		int d;
		for(d=1; d<10; d++) {
			four.add(5*d);
		}
		ArrayList<Integer> five=new ArrayList<Integer>();
		int e;
		for(e=1; e<10; e++) {
			five.add(6*e);
		}
		ArrayList<Integer> six=new ArrayList<Integer>();
		int f;
		for(f=1; f<10; f++) {
			six.add(7*f);
		}
		ArrayList<Integer> seven=new ArrayList<Integer>();
		int g;
		for(g=1; g<10; g++) {
			seven.add(8*g);
		}
		ArrayList<Integer> ate=new ArrayList<Integer>();
		int h;
		for(h=1; h<10; h++) {
			ate.add(9*h);
		}
		HashMap<String, ArrayList<Integer>> i= new HashMap<String, ArrayList<Integer>>();
		i.put("2단", one);
		i.put("3단", two);
		i.put("4단", three);
		i.put("5단", four);
		i.put("6단", five);
		i.put("7단", six);
		i.put("8단", seven);
		i.put("9단", ate);
		System.out.println(i.get("2단"));
		System.out.println(i.get("3단"));
		System.out.println(i.get("4단"));
		System.out.println(i.get("5단"));
		System.out.println(i.get("6단"));
		System.out.println(i.get("7단"));
		System.out.println(i.get("8단"));
		System.out.println(i.get("9단"));
	}

}
