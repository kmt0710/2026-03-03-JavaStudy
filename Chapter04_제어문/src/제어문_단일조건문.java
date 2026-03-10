import java.util.*;
import java.util.Scanner;

public class 제어문_단일조건문 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int com = rand.nextInt(3);
		String[] str = {"가위","바위","보"};
		System.out.print("가위:0 바위:1 보:2 \n숫자를 입력해주세요:");
		
		int user = scan.nextInt();
		
		System.out.print("컴퓨터 : " + str[com]);
		
//		if(com==0)
//			System.out.print("가위");
//		if(com==1) 
//			System.out.print("바위");
//		if(com==2) 
//			System.out.print("보");
			
		System.out.print(" 사용자 : " + str[user]);
		
//		if(user==0) 
//			System.out.print("가위");
//		if(user==1) 
//			System.out.print("바위");
//		if(user==2) 
//			System.out.print("보");
		
		System.out.println("\n------결과------");
		
//		if(com==user)
//			System.out.println("비김");
//		if(com==0 && user==1)
//			System.out.println("사용자 win");
//		if(com==0 && user==2)
//			System.out.println("컴퓨터 win");
//		if(com==1 && user==0)
//			System.out.println("컴퓨터 win");
//		if(com==1 && user==2)
//			System.out.println("사용자 win");
//		if(com==2 && user==0)
//			System.out.println("사용자 win");
//		if(com==2 && user==1)
//			System.out.println("컴퓨터 win");
	
		int res = com-user;
		
		if(res==-1 || res==2)
			System.out.println("사용자 Win!!");
		if(res==1 || res==-2)
			System.out.println("컴퓨터 Win!!");
		if(res==0)
			System.out.println("비겼다");
	}
}
