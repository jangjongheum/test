package test;

public class ex03 {

	public static void main(String[] args) {
		int money=58240;
	System.out.println(money);
	System.out.println(money/10000+"만원");// (/)는 나누기의 값 58240원에서 1만원씩 나눈다.
	money%=10000;//나누고 나서의 몫을 구해서 아래에서도 나눌수있게 해준다.
	System.out.println(money/5000+"오천원");
	money%=5000;
	System.out.println(money/1000+"천원");
	money%=1000;
	System.out.println(money/100+"백원");
	money%=100;
	System.out.println(money/10+"십원");
	}
}