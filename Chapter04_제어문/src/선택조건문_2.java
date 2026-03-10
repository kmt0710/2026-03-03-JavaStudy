import java.util.Scanner;

public class 선택조건문_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도를입려해주세요");
		
		int year = scan.nextInt();
		
		System.out.println("입력된 년도 : " + year);
		
		if(year%100!=00 && year%4==0 || year%400==0)
			System.out.println( year +"년은 윤년입니다");
		
		else
			System.out.println( year +"년은 윤년이 아닙니다");
			
	}
}
