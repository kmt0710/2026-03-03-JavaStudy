import java.util.Scanner;

public class 제어문_선택문_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 점수");
		int num1 = scan.nextInt();
		System.out.println("연산자 입력 (+,-,*,/):");
		String op = scan.next();
		System.out.println("두번째 점수");
		int num2 = scan.nextInt();
		
		switch(op)
		{
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			break;
		default:
			System.out.println("연산처리를 할 수 없습니다.");
		}
	}
}
