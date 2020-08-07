package test2;

import java.util.ArrayList;

public class ex02_1 {

	public static void main(String[] args) {
		ArrayList<ex02> member=new ArrayList<ex02>();
		
		ex02 nn=new ex02();
		nn.setName("red");
		nn.setBirth("1월 11일");
		nn.setRname("elsword");
		nn.setPart("전사");
		
		ex02 aa=new ex02();
		aa.setName("blue");
		aa.setBirth("2월 22일");
		aa.setRname("chung");
		aa.setPart("탱커");
		
		member.add(nn);
		member.add(aa);
		
		for(int i=0; i<member.size(); i++) {
			System.out.println("-----------");
			System.out.println(member.get(i).getName());
			System.out.println(member.get(i).getBirth());
			System.out.println(member.get(i).getRname());
			System.out.println(member.get(i).getPart());
			System.out.println("-----------");
		}
	}

}
