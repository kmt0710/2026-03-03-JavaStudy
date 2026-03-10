import java.util.Scanner;

public class 제어문_선택조건문 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번쨰 정수 입력:");
		int num2=scan.nextInt();
		
		int num3 = num1>num2?num1:num2;
		
		if(num3==num1){
			System.out.print("최대값" + num1);
			System.out.print(" 최소값" + num2);
		}
		
		else {
			System.out.print("최대값" + num2);
			System.out.print(" 최소값" + num1);
		}
	}
}
