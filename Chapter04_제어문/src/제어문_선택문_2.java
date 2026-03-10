import java.util.Scanner;

public class 제어문_선택문_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.가요");
			System.out.println("2.트롯");
			System.out.println("3.ost");
			System.out.println("4.jazz");
			System.out.println("5.pop");
			System.out.println("6.classic");
			System.out.println("7.종료");
			System.out.println("----------------");
			System.out.println("메뉴선택");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 7:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
}
