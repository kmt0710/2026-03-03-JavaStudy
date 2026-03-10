import java.util.Scanner;
import java.util.Random;

public class 선택조건문 {
	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(100)+1;
		
		System.out.println("정수값 : " + i);
		
		if(i%2==0)
			System.out.println(i + "는 짝수 입니다.");
		 
		else if(i%2==1)
			System.out.println(i + "는 홀수 입니다.");

		
		char c = 'A';
		
		if(i%2==0)
			c = (char)(r.nextInt(26) + 65);
	
		else if(i%2==1)
			c = (char)(r.nextInt(26) + 95);
	
		
		if(c>='A' && c<='Z')
			System.out.println(c + "는 대문자");
		 
		else if(i%2==1)
			System.out.println(c + "는 소문자");

	}
}
