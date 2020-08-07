package test;

public class ex05 {

	public static void main(String[] args) {
		
		for(int i=0; i<=500; i+=4) {
			if(i%100!=0) {
			System.out.println(i+2000);
		}else if(i%400==0) {
			System.out.println(i+2000);
		}
	}
}

}
