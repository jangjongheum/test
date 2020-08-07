
package test;

public class ex07 {

	public static void main(String[] args) {
		int[] a=new int[9];
		int[] b=new int[9];//b의 배열의 길이는 9
		
		for(int i=0; i<b.length; i++) {//i가 1부터 시작해서 배열인 b의 길이만큼 돌면서 증가한다.
			b[i] = (i+1);//반복문으로 돌린 i의 값을 대입해준다.
			a[i] = b[i];
			System.out.println(b[1]+"*"+a[i]+"="+b[1]*a[i]);
		}
	}

}
