package test2;

import java.util.ArrayList;
import java.util.HashMap;

public class ex04 {

	public static void main(String[] args) {
		
		ArrayList<String> nuest=new ArrayList<String>();
		ArrayList<String> nuestw=new ArrayList<String>();
		
		nuest.add("������");
		nuest.add("���Ʒ�");
		nuest.add("����ȣ");
		nuest.add("�ֹα�");
		nuest.add("Ȳ����");
		
		nuestw.add("���ž�");
		nuestw.add("������");
		nuestw.add("������");
		nuestw.add("�ֱֹ�");
		
		System.out.println(nuest);//nuest�� add�� �������ϴ� ������ ��������� ����Ѱ�
		System.out.println(nuestw);//nuestw�� add�� �������ϴ� ������ ��������� ����Ѱ�
		System.out.println("=============================");
		
		HashMap<String, ArrayList<String>> ha=new HashMap<String, ArrayList<String>>();//�ؽ��ʿ��ٰ� ��̸���Ʈ�� �������� �ִ�.
		//���� ������ Arraylist�� �ؽ��ʿ� �־��ַ��� �Ѵٸ� �޴°��� <String, ArrayList<String>>���ؼ� 
		//ù��° key���� String Ÿ������ �ް� ��̸���Ʈ�� value���� StringŸ������ �޴´�.
		ha.put("ù����", nuest);//�ؽ��ʿ��� �߰��Ҷ� put���� ��̸���Ʈ���� �߰��ҋ� add�� 
		ha.put("�ι���", nuestw);//�ؽ��ʿ��� ù��°���� key�� �ι��� ���� value���̴�.
		
		System.out.println(ha.get("ù����"));//ù��°���� ����ϰ� ������ key���� ��� ù������ �־�� value���� �����ü��ִ�.
		System.out.println(ha.get("�ι���"));
	}

}
