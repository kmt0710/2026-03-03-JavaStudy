import java.util.*;
import java.util.Scanner;

public class 제어문_선택조건문_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("정수를 입력해주세요 : ");
		
		num = scan.nextInt();
		
//		if(num==0) {
//			System.out.println("잘 못 된 입력입니다.");
//		//	return;
//		}
//		
//		else {
//			if(num<0)
//				System.out.println(num*-1);
//			else
//				System.out.println(num);	
//		}

		if(num<0)
			System.out.println(num*-1);
		else
			System.out.println(num);	
		//검증
		System.out.println("검증:" + Math.abs(num));
	}
}