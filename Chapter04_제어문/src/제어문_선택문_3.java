import java.util.Scanner;
import java.util.Random;

public class 제어문_선택문_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int com = (int)(rand.nextInt(3));
		System.out.println("가위0 바위1 보2");
		int user=scan.nextInt();
		
		if(user>=0 && user<=2)
			System.out.println("정상 입력");
		
		else
			System.out.println("Game Over");
		
		switch(com)
		{
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
		}
		
		switch(user)
		{
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
		}
		
		System.out.println("\n======결과=======");
		switch(com-user)
		{
		case -1: case 2:
			System.out.println("사용자 Win");
			break;

		case 1: case -2:
			System.out.println("컴퓨터 Win");
			break;

		case 0:
			System.out.println("비겼습니다");
			break;
		}
	}
}
