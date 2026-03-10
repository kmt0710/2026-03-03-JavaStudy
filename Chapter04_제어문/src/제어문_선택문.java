import java.util.Scanner;

public class 제어문_선택문 {
	public static void main(String[] args) {
		int no = 1;
		
//		switch(no)
//		{
//		case 1:
//			System.out.println("1");
//		case 2:
//			System.out.println("2");
//			break;
//		case 3:
//			System.out.println("3");
//		default:
//			System.out.println("4");
//		}
		
		char op = ' ';
		
		switch(no)
		{
			case 10:
			case 9:
				op='a';
				break;
			case 8:
				op = 'b';
				break;
			case 7:
				op = 'c';
				break;
			case 6:
				op = 'd';
				break;
			default:
				op='f';
					
		}
		System.out.println(op);
	}
}
