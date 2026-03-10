import java.util.*;

public class 제어문_조건문 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월 입력:");
		int no = scan.nextInt();

		if(no>=1 &&no<=12) {
			if (no>=3 && no <=5)
				System.out.println("게절은 봄 입니다.");

			else if (no>=6 && no <=8)
				System.out.println("게절은 여름 입니다.");
		
			else if (no>=9 && no <=11)
				System.out.println("게절은 가을 입니다.");
		
			else	
				System.out.println("게절은 겨울 입니다.");
		}
		else	
			System.out.println(no + "월은 없는 달 입니다.");
	
	}
}
