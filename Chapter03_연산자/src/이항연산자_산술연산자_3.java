import java.util.Scanner;
// 정수 입력 => 짝수 / 홀수

public class 이항연산자_산술연산자_3 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		String res = (num%2==0) ? "짝수" : "홀수";
//		
//		System.out.println(num + " 는(은) " + res + " 입니다.");
//		
//		int no = 369;
//		System.out.println(no/100);
//		System.out.println((no%100)/10);
//		System.out.println();
		
		
		//암기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도를 입력해주세요 : ");
		int year = scan.nextInt();
		
		String result = ((year%4==0)&&(year%100!=0)||(year%400==0) ? "운년입니다." : "일반년도입니다.");
		
		System.out.println(result);
	}
}
