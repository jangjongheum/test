package test2;

import java.util.ArrayList;

public class ex02_1 {

	public static void main(String[] args) {
		ArrayList<ex02> member=new ArrayList<ex02>();
		
		ex02 nn=new ex02();
		nn.setName("red");
		nn.setBirth("1�� 11��");
		nn.setRname("elsword");
		nn.setPart("����");
		
		ex02 aa=new ex02();
		aa.setName("blue");
		aa.setBirth("2�� 22��");
		aa.setRname("chung");
		aa.setPart("��Ŀ");
		
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
