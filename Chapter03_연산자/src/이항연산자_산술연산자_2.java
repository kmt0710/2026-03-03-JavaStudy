
public class 이항연산자_산술연산자_2 {
	public static void main(String[] args) {
		int a= (int)(Math.random()*100)+1;
		int b= (int)(Math.random()*100)+1;
		int c= (int)(Math.random()*100)+1;
		int d= (int)(Math.random()*100)+1;
		int e= (int)(Math.random()*100)+1;
		
		System.out.println("a="+a);
		System.out.println("b="+a);
		System.out.println("c="+a);
		System.out.println("d="+a);
		System.out.println("e="+a);
		
		double res = (a+b+c+d+e)/5.0;
		
		System.out.println("결과값:"+res);
	}
	
}
