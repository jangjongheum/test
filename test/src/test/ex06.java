package test;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.out.print("입력"+j);
		System.out.print("반복수 입력:");
		int num=sc.nextInt();
		int i;
		for (i = num; i >=0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");//공백
			}//j end
				// 콘솔창에 정수를 직접 집어넣을수있게 int num이라는 변수를 만들고
//			num이라는 변수안에 스캐너를 넣어서 num을 쓰면 콘솔창에 적을수있게 해주고 반복문에 num을넣어서 몇번돌릴지 적어줄수있게 해준다.
				for (int k = i ; k <num; k++) {//조건을 scanner로 주고 아무값이나 적으면 *를 얼마나 넣을건지 해주는거고
					//첫번째 for문에서 생성해준 변수의 값이 공백을 얼마나 넣을건지 해주는것이다. 
					System.out.print("*");
				}//k end
				
}//i end
		}
	}