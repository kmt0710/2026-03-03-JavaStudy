import java.util.*;

public class 삼향연산자 {
	public static void main(String[] args) {
		Random rand = new Random();
//		int num = (int)rand.nextInt(100) + 1;
//		System.out.println("num="+num);
//		
//		String result=num%2==0?"짝수":"홀수";
//		
//		System.out.println(num + "는(은) " + result + "입니다.");
		
//		int num = (int)(rand.nextInt(2));
//		char c = num==0?(char)((int)(rand.nextInt(26))+65):
//			(char)((int)(rand.nextInt(26))+97);
//		
//		System.out.println(c);
//		
//		String result = (c>'A' && c<= 'Z')?"대문자":"소문자";
//		
//		System.out.println(result);
		int num1 = rand.nextInt(100)+1;
		int num2 = rand.nextInt(100)+1;
		int num3 = rand.nextInt(100)+1;
		
		int max = num1<num2?num2:num1;
		int min = num1<num2?num1:num2;
		
		System.out.println(num1 + " " + num2);
		System.out.println("큰수 : " + max);
		System.out.println("작은수 : " + min);
		
		String result=num3%3==0?"3의 배수":"3의 배수가 아닙니다.";
		
		System.out.println(num3 + "은(는) " + result);
	}
}
