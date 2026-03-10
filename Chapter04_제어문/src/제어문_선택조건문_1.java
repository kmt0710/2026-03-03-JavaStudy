import java.util.Scanner;

public class 제어문_선택조건문_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID 입력:");
		String id = scan.next();
		
		System.out.println("비밀번호 입력:");
		String pwd = scan.next();
		
		if(id.equals("admin") && pwd.equals("1234"))
			System.out.println("로그인되었습니다.");
		
		else
			System.out.println("ID나 Password가 틀립니다.");
	}
}
