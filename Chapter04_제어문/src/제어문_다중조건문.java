import java.util.*;
import java.util.Scanner;


//사칙 연산 계산기
public class 제어문_다중조건문 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = scan.nextInt();

		System.out.printf("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		System.out.println("첫번째 정수 : ");
		int num2 = scan.nextInt();
		
		char c=op.charAt(0);
		
		if(c=='+')
			System.out.printf("%d+%d=%d\n",num1, num2, num1+num2);
		
		else if(c=='-')
			System.out.printf("%d-%d=%d\n",num1, num2, num1-num2);
		
		else if(c=='*')
			System.out.printf("%d*%d=%d\n",num1, num2, num1*num2);
		
		else if(c=='/')
			System.out.printf("%d/%d=%d\n",num1, num2, num1/num2);
		
		else
			System.out.println("잘못된 연산입니다");
	}
}
