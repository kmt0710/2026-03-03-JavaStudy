import java.util.*;
import java.util.Scanner;

public class 제어문_종류 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		
		int num = scan.nextInt();
		
		if(num%2==0)
			System.out.println("짝수 입니다");
		
		if(num%2!=0)
			System.out.println("홀수 입니다");
	}
}
