package test;

public class ex03 {

	public static void main(String[] args) {
		int money=58240;
	System.out.println(money);
	System.out.println(money/10000+"����");// (/)�� �������� �� 58240������ 1������ ������.
	money%=10000;//������ ������ ���� ���ؼ� �Ʒ������� �������ְ� ���ش�.
	System.out.println(money/5000+"��õ��");
	money%=5000;
	System.out.println(money/1000+"õ��");
	money%=1000;
	System.out.println(money/100+"���");
	money%=100;
	System.out.println(money/10+"�ʿ�");
	}
}