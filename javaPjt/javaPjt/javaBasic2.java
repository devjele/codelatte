package javaPjt;

public class javaBasic2 {

	public static void main(String[] args) {
		// 문자열 만들기
		// %s는 일반적으로 문자열을 대입해주는 지정자
		String name = "록카";
		String output = String.format("내 이름은 %s 이다", name);
		System.out.println(output);

		// \n : print 또는 printf 줄바꿈
		name = "알클래스";
		System.out.printf("내 이름은 %s이다\n", name);
				
		// %f는 실수를 대입해주는 지정자
		float temperature = 23.5f;
		output = String.format("오늘의 온도는 %f도 이다", temperature);
		System.out.println(output);
	}
}
