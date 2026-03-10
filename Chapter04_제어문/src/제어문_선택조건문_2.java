import java.util.*;
import java.util.Scanner;

public class 제어문_선택조건문_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수 입력");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수 입력");
		int eng = scan.nextInt();
	
		System.out.println("수학 점수 입력");
		int math = scan.nextInt();
		
		double avg = (kor+eng+math)/3.0;
		
		if(avg>=60)
			System.out.println("합격");
		
		else
			System.out.println("불합격");
	}
}
