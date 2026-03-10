import java.util.*;
import java.util.Scanner;

public class 자바_연산자_정리 {
	public static void main(String[] args) {
//		Random rand = new Random();
//		Set<Integer> set = new HashSet<>();
//		List<Integer> arr = new ArrayList<>();
//		List<Integer> list = new ArrayList<>();
//		
//		for(int i = 0; i < 30; i++){
//			arr.add((int)rand.nextInt(100)+1);
//		}
//		
//		for(int n : arr){
//			if(!set.contains(n))
//			{
//				set.add(n);
//				list.add(n);
//			}
//			
//			else
//				System.out.println("에에엥 중복");
//		}
//		
//		System.out.println(list.size());
//		System.out.println(list);
//		
		
		Scanner scan = new Scanner(System.in);
		int height = 0;
		int width = 0;
		int mid = 0;
		int htmd = 0;
		boolean key = true;
		
//		while(key) { //왕관 만들기
//			System.out.println("몇줄인지 입력해주세요 : ");
//			height = scan.nextInt();
//			width = height*4-3;
//			mid = width / 2;
//			
//			if(height==0)
//				key = false;
//				
//			for(int i = 0; i < height; i++)	{ 
//				for(int j = 0; j < width; j++){
//						System.out.print(j<=i || j>=width-1 - i || Math.abs(j-mid) <= i ? "*" :" ");
//					}
//				System.out.println("");
//				}
//			}
		
		while(key) { // 모래시계 홀수만 가능
		System.out.println("몇줄인지 입력해주세요 : ");
		height = scan.nextInt();
		
		mid = height / 2;
		int reval = 0; // 위 아래 반전
		
		if(height==0)
			key = false;
			
		for(int i = 0; i < height; i++)	{ 
			for(int j = 0; j < height; j++){
				//System.out.print(Math.abs(i-mid));
				reval = i<mid ? i : height-i-1;
				if(j<reval)
					System.out.print(" ");
				else
					System.out.print(j<=reval+Math.abs(i-mid)*2 ? "*": " ");
				}
			System.out.println("");
			}
		}

		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		//
		//

		
//		while(key) {
//			System.out.println("몇줄인지 입력해주세요 : ");
//			height = scan.nextInt();
//			width = height*2-1;
//			mid = width/2;
//			htmd = height/2-1;
//			
//			if(height==0)
//				key = false;
//				
//			for(int i = 0; i < height; i++)	{ // 별 만들기
//				for(int j = 0; j < width; j++){
//					if(i<htmd){ //별 윗부분
//						System.out.print(Math.abs(j-mid) <= i ? "*" : " ");	
//					}	
//					
//					else if(i==htmd) //중앙선
//						System.out.print("*");
//					
//					else{ //별 아래부분
//						int a=i-htmd-1; // 줄 for문 값을 0으로 초기화;
//							if(htmd<Math.abs(j-mid))
//								System.out.print(" ");
//						
//							else
//								System.out.print(a>Math.abs(j-mid)? " ": "*");
//							
//					}
//				}
//				System.out.println("");
//			}
//		}

	
		
//		for(int i = 0; i < 3; i++)	{
//			for(int j = 0; j < 3*2-1; j++){
//			//	System.out.print(Math.abs(j-(3*2-1)/2));
//				System.out.print(i<=Math.abs(j-(3*2-1)/2) ? "*" :" ");	
//			}
//			System.out.println("");
//		}	
		
//		
		
		//Set<Integer> set = new HashSet<>();
		
//		int a = 10;
//		{
//			int b= 20;
//			{
//				int c= 30;
//				System.out.println("a=" + a);
//				System.out.println("b=" + b);
//				System.out.println("c=" + c);
//			}
//			System.out.println("a=" + a);
//			System.out.println("b=" + b);
////			System.out.println("c=" + c);
//		}
//		System.out.println("a=" + a);
////		System.out.println("b=" + b);
////		System.out.println("c=" + c);
	}
}
