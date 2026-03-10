import java.util.Scanner;

public class 자바변수연산자정리 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int kor=99; 
		kor++;
		
	//	System.out.println("국어 : " + kor);
		
		int eng = 80;
		eng--;
		
	//	System.out.println("영어 : " + eng);
		
		boolean b = false;
		
	//	System.out.println("반대:" + !b);
		
		int math = 60;
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
	//	System.out.printf("총점 :%d 평균 : %.2f", total, avg);
		
		System.out.println(5%-2);
	}
}
  