
package test;

public class ex07 {

	public static void main(String[] args) {
		int[] a=new int[9];
		int[] b=new int[9];//b�� �迭�� ���̴� 9
		
		for(int i=0; i<b.length; i++) {//i�� 1���� �����ؼ� �迭�� b�� ���̸�ŭ ���鼭 �����Ѵ�.
			b[i] = (i+1);//�ݺ������� ���� i�� ���� �������ش�.
			a[i] = b[i];
			System.out.println(b[1]+"*"+a[i]+"="+b[1]*a[i]);
		}
	}

}
