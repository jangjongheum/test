package test;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.out.print("�Է�"+j);
		System.out.print("�ݺ��� �Է�:");
		int num=sc.nextInt();
		int i;
		for (i = num; i >=0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");//����
			}//j end
				// �ܼ�â�� ������ ���� ����������ְ� int num�̶�� ������ �����
//			num�̶�� �����ȿ� ��ĳ�ʸ� �־ num�� ���� �ܼ�â�� �������ְ� ���ְ� �ݺ����� num���־ ��������� �����ټ��ְ� ���ش�.
				for (int k = i ; k <num; k++) {//������ scanner�� �ְ� �ƹ����̳� ������ *�� �󸶳� �������� ���ִ°Ű�
					//ù��° for������ �������� ������ ���� ������ �󸶳� �������� ���ִ°��̴�. 
					System.out.print("*");
				}//k end
				
}//i end
		}
	}