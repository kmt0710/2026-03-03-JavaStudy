import java.util.Scanner;

public class 연산자종류 {
	public static void main(String[] args) {
//		System.out.println("\"홍길동\"");
//		System.out.print("Hello\n")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ;
//		System.out.print("Java\tOracle");
		
		System.out.println("몇 줄 인지 입력 해주세요.");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b= a*4-3; // a=3 b=9 0 4 8 01 345 78 
		int mid = b/2;
		
		for(int i = 0; i<a; i++)
		{
			for(int j = 0; j<b; j++)
			{
//				if(j<=i || j==mid || j>=b-1-i)
//					System.out.print("*");
//				
//				else if(j>i && j>mid-i && j<=mid+i) // == Math.abs(j - mid) <= i
//					System.out.print("*");
				
//				if (j <= i || j >= b - 1 - i || Math.abs(j - mid) <= i)
//					System.out.print("*");
				
//				else
//					System.out.print(" ");
				
				System.out.print(j <= i || j >= b - 1 - i || Math.abs(j - mid) <= i ? "*" : " ");
			}
			System.out.println("");
		}
	}
}

//*   *   *
//** *** **
//*********
//
//
//*     *     *
//**   ***   **
//*** ***** ***
//*************
//
//0 4 8
//01 345 78
//0 6 12 
//b = 9 
//
//
//	
//else if(i< && j == b/2-i)