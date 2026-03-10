import java.util.Scanner;

public class 변수_2 {
	public static void main(String[] args) {
		/*
		 * 사과 5개 중 2개를 먹었다 남아있는 사과의 갯수는
		 *//*
			 * int 사과 = 5; int 먹은수 = 2; int total = 사과 - 먹은수;
			 * 
			 * System.out.println("남은 사과 갯수 : " + total );
			 */
		/*
		 * 국어 80 
		 * 영어 90 
		 * 수학 70 
		 * 평균 구하기
		 */
		/*
		 * System.out.println((국어+영어+수학)/3);
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 영어 수학 입력");
		int 국어 = scan.nextInt();
		int 영어 = scan.nextInt();
		int 수학 = scan.nextInt();
		
		System.out.printf("평균:%.2f", (국어+영어+수학)/3.0);
	}
}
