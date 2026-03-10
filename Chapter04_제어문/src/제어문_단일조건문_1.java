import java.util.Scanner;
import java.util.*;

public class 제어문_단일조건문_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳 입력:");
		String ch=scan.next();
		char c= ch.charAt(0);
		
		System.out.println("알파뱃 : " + c);
		
		if(c>='A' && c<='Z')
			System.out.println(c + "는(은) 대문자");
	
		if(c>='a' && c<='z')
			System.out.println(c + "는(은) 소문자");
		
		if(c>='0' && c<='9')
			System.out.println(c + "는(은) 숫자");
	}
}
