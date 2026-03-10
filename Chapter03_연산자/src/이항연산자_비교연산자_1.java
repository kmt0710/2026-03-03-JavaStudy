import java.text.ChoiceFormat;
import java.util.*;
public class 이항연산자_비교연산자_1 {
	public static void main(String[] args) {
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		int num3=(int)(Math.random()*100)+1;
//		int num4=(int)(Math.random()*100)+1;
//		int num5=(int)(Math.random()*100)+1;
//		int num6=(int)(Math.random()*100)+1;
//		int num7=(int)(Math.random()*100)+1;
//		int num8=(int)(Math.random()*100)+1;
//		int num9=(int)(Math.random()*100)+1;
//		int num10=(int)(Math.random()*100)+1;
//		int num11=(int)(Math.random()*100)+1;
//		int num12=(int)(Math.random()*100)+1;
//		int num13=(int)(Math.random()*100)+1;
//		int num14=(int)(Math.random()*100)+1;
//		int num15=(int)(Math.random()*100)+1;
//		
//		int[] numbox = new int[] {(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,};
//
//		
//		ChoiceFormat cf = new ChoiceFormat(numbox.toString());
//		
//		int i = 0;
//		int l = 0;
//		boolean key = true;
//		
//		while(key)
//		{
//			l = 0;
//			System.out.println((i+1) + " 번째 실행 \n");
//			
//			for(int o = 0; o < numbox.length; o++)
//			{
//				System.out.print(numbox[o] + " ");
//			}
//			
//			System.out.println("");
//			
//			for(int j =0; j<numbox.length; j++)
//			{
//				if(numbox[j]==numbox[i] && j!=i)
//				{
//					System.out.println("\n중복 재실행 \n");
//					numbox = new int[] {(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*100)+1,};
//					i=0;
//					l++;
//					break;
//				}
//			}
//			i++;
//			
//			if(l==0)
//				key=false;
//		}
		
//		Set<Integer> numSet = new HashSet<>();
//
//        while(numSet.size() < 10) {
//            numSet.add((int)(Math.random() * 100) + 1);
//        }
//
//        int[] numbox = new int[10];
//        int i = 0;
//
//        for(int num : numSet) {
//            numbox[i++] = num;
//        }
//
//        for(int n : numbox) {
//            System.out.print(n + " ");
//        }
		
		Random rand = new Random();
        Set<Integer> set = new HashSet<>();

        while(set.size() < 10) {
            set.add(rand.nextInt(100) + 1);
        }

        System.out.println(set);
  
		//Random rand = new Random();
//        int[] numbox = new int[40];
//        int num = 0;
//        boolean duplicate = true;
//        
//        for(int i = 0; i < numbox.length; i++) {
//            do {
//                num = (int)(rand.nextInt(100)) + 1;
//                duplicate = false;
//
//                for(int j = 0; j < i; j++) {
//                    if(numbox[j] == num) {
//                        duplicate = true;
//                        break;
//                    }
//                }
//
//            } while(duplicate);
//
//            numbox[i] = num;
//        }
//
//        for(int n : numbox) {
//            System.out.print(n + " ");
//        }
        
//		int max = num1>num2?num1:num2;
//		max = max>num3?max:num3;
//		System.out.println("최대값 : " + max);
//		
//		int min = num1<num2?num1:num2;
//		min = min<num3?min:num3;
//		System.out.println("최소값 : " + min);
//		
//		int mid = num1+num2+num3-max-min;
//		System.out.println("중간값 : " + mid);
		
//		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + 
//		num6 + ", " + num7 + ", " + num8 + ", " + num9 + ", " + num10 + ", " + num11
//		 + ", " + num12 + ", " + num13 + ", " + num14 + ", " + num15);
	}
}
