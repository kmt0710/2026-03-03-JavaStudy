import java.util.Scanner;

public class 이향연산자_논리연산자1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("점수입력 (0~100):");
		
		int score = scan.nextInt();
		
		String res = score >= 0 && score<=100?"정삽입력" : "비정상입력";
		
		System.out.println(res);
	}
}
