package test2;

import java.util.ArrayList;
import java.util.HashMap;

public class ex04 {

	public static void main(String[] args) {
		
		ArrayList<String> nuest=new ArrayList<String>();
		ArrayList<String> nuestw=new ArrayList<String>();
		
		nuest.add("김종현");
		nuest.add("곽아론");
		nuest.add("강동호");
		nuest.add("최민기");
		nuest.add("황민현");
		
		nuestw.add("김쩨알");
		nuestw.add("곽영웅");
		nuestw.add("강동글");
		nuestw.add("최밍기");
		
		System.out.println(nuest);//nuest에 add로 내가원하는 정보를 집어넣은걸 출력한것
		System.out.println(nuestw);//nuestw에 add로 내가원하는 정보를 집어넣은걸 출력한것
		System.out.println("=============================");
		
		HashMap<String, ArrayList<String>> ha=new HashMap<String, ArrayList<String>>();//해쉬맵에다가 어레이리스트를 넣을수도 있다.
		//내가 만들어둔 Arraylist를 해쉬맵에 넣어주려고 한다면 받는값을 <String, ArrayList<String>>을해서 
		//첫번째 key값은 String 타입으로 받고 어레이리스트의 value값은 String타입으로 받는다.
		ha.put("첫번쨰", nuest);//해쉬맵에선 추가할때 put으로 어레이리스트에선 추가할떄 add로 
		ha.put("두번쨰", nuestw);//해쉬맵에서 첫번째값은 key값 두번쨰 값은 value값이다.
		
		System.out.println(ha.get("첫번쨰"));//첫번째값을 출력하고 싶을땐 key값을 적어서 첫번쨰로 넣어둔 value값을 가져올수있다.
		System.out.println(ha.get("두번쨰"));
	}

}
