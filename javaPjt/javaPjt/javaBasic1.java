package javaPjt;

public class javaBasic1 {

	public static void main(String[] args) {
		// 1~10까지의 자연수 중 짝수를 구하시오.				
		int number = 1;
		do {
			if(0 == number % 2) {
				System.out.println(number);				
			}
			number = number + 1;
		} while (number <= 10);
	}
}
