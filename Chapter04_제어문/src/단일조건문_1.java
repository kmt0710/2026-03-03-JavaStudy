import java.util.Random;
import java.util.HashSet;

public class 단일조건문_1 {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet set = new HashSet<>();
		
		int[] num = {r.nextInt(100)+1,r.nextInt(100)+1,r.nextInt(100)+1,r.nextInt(100)+1,r.nextInt(100)+1,r.nextInt(100)+1,r.nextInt(100)+1,r.nextInt(100)+1,r.nextInt(100)+1};
	
		
		for(int i=0; i<num.length; i++)
		{	
			if(set.equals(num[i]))
			{
				num[i] = r.nextInt(100)+1; 
				System.out.println("!!");
			}
			
			set.add(num[i]);
		}
		
		
		int max = num[0];
		if(max<num[1])
			max=num[1];
		if(max<num[2])
			max=num[2];
		
		System.out.println("\n 최대값 : " + max);
		
		int min = num[0];
		if(min>num[1])
			min=num[1];
		if(min>num[2])
			min=num[2];
		
		System.out.println("최소값 : " + min);	
		
		int midle = num[0]+num[1]+num[2]-max-min;

		System.out.println("중간값 : " + midle);
		}
}
