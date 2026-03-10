import java.util.Random;

public class 제어문_다중조건문_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int kor = (int)rand.nextInt(50) + 51;
		int eng = (int)rand.nextInt(50) + 51;
		int math = (int)rand.nextInt(50) + 51;
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("국어 점수 : " + eng);
		System.out.println("국어 점수 : " + math);
		
		int total = kor + eng+ math;
		
		int avg = total/3;
		
		char score = ' ';
		char op = ' ';
		
		if(avg>90) {
			score = 'A';
			if(avg>=97) op = '+';
			else if (avg>94) op = '0';
			else op = '-';
		}
		
		else if(avg>80) {
			score = 'B';
			if(avg>=87) op = '+';
			else if (avg>84) op = '0';
			else op = '-';
		}
		
		else if(avg>70) {
			score = 'C';
			if(avg>=77) op = '+';
			else if (avg>74) op = '0';
			else op = '-';
		}
		
		else if(avg>60) {
			score = 'D';
			if(avg>=67) op = '+';
			else if (avg>64) op = '0';
			else op = '-';
		}
		
		else{
			score = 'F';
			op = ' ';
		}
		
		System.out.println("총점 :" + total + " 평균 : " + avg + " 학점 : " + score+op);
	}
}
