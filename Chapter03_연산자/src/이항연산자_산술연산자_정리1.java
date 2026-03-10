import java.util.Scanner;
import java.text.*;

public class 이항연산자_산술연산자_정리1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = scan.nextInt();
		
		//요청
		
		int total = kor + eng + math;
		
		double avg = total / 3.0;
		
		// 학점
		
		String pattern = "50#D|70#C|80<B|90#A";
		double[] limits = {50,	 60, 64, 67, 70, 74, 77, 80, 84, 87, 90, 94, 97};
		String[] score = {"F", "D-", "D0", "D+", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
//		ChoiceFormat cf = new ChoiceFormat(limits, score);
		ChoiceFormat cf = new ChoiceFormat(pattern);

		System.out.println("국어 : " + kor );
		System.out.println("영어 : " + eng );
		System.out.println("수학 : " + math );
		System.out.println("총점 : " + total );
		System.out.printf("평균 : %.2f\n", avg );
		System.out.println("학점 : " + cf.format(avg));
		
	}
}
