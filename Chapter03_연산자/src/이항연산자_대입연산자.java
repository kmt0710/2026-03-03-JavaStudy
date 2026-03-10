import java.util.*;

public class 이항연산자_대입연산자 {
	public static void main(String[] args) {
//		char c=65;
		Random rand = new Random();
//		char d = (char)((int)(rand.nextInt(26))+65);
//		System.out.println(d);
//		
		HashSet<Integer> set = new HashSet<>();
		int[] arr = new int[50];
		List<Integer> list = new ArrayList<>();
		int a = 0;
		
		for(int i = 0 ; i<50; i++)
		{
			arr[i] = (int)(rand.nextInt(100)+1);
		}
		
		for(int n : arr)
		{
			if(!set.contains(n))
			{
				set.add(n);
				list.add(n);
			}
			else
				a++;
		}
		
		System.out.println("중복 수 : " + a);
		System.out.println(list);
		System.out.println(list.size());
		
//		
//		int sum = 0;
//		
//		for(int i = 1; i<=100; i++)
//		{
//			sum+=i;
//		}
//		
//		System.out.println(sum);
		
//		int even = 0;
//		int odd = 0;
//		int sum = 0;
//		
//		
//		for(int i = 1; i<=100; i++)
//		{
//			if(i%2==0)
//				even+=i;
//			else
//				odd+=i;
//			
//			sum+=i;
//		}
//
//		System.out.println("짝수합 : " + even);
//		System.out.println("홀수합 : " + odd);
//		System.out.println("총합 : " + sum);
//		
//		String alpha = "";
//		
//		for(char c='A'; c<='Z'; c++)
//		{
//			alpha=alpha+c;
//		}
//		
//		System.out.println(alpha);

	}
}
