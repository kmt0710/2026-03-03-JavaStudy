import java.util.Scanner;

public class 제어문_선택문_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요");
		int num = scan.nextInt();
		
		char op= ' ';
		
//		switch(num/10)
//		{
//		case 10: case9:
//			op='A';
//			break;
//		case 8:
//			op='B';
//			break;
//		case 7:
//			op='C';
//			break;
//		case 6:
//			op='D';
//			break;
//		default:
//			op = 'F';
//		}
//		System.out.println("학점:" + op);

		String grade = switch(num/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		System.out.println("학점:" + grade);
	}
}
