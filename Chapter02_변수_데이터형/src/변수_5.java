import java.util.Scanner;

public class 변수_5 {
	public static void main(String[] args) {
//		int 국어 = 0;
//		int 수학 = 0;
//		int 영어 = 0;
//		int 총점 = 0;
//		double 평균 = 0.0;
//		Scanner scan = new Scanner(System.in);
//		String 학점 = "0";
//		int 등수 = 0;
//		
//		System.out.println(" 국어 수학 영어 총점 평균 학점 등수 :");
////		
//		int drink = 12;
//		
//		drink -= 5;
//		
//		System.out.println("남은 음료수 : "+drink);
		
//		int 샌드위치 = 250;
//		int 사과 = 100;
//		int 쥬스 = 150;
//		int 총칼로리 = 0;
//		
//		총칼로리 = 샌드위치 + 사과*2 + 쥬스;
//		
//		System.out.println("일일 총 칼로리 : " + 총칼로리);

		String name = "홍길동";
		String sex = "남성";
		int age = 20;
		double height = 180.5;
		boolean isCard = false;
		int milk = 1200;
		int bread = 1500;
		int egg = 200;
		int cart = 0;
		
		cart = milk*2 + bread*3 + egg*10;
		
		System.out.println(name + " " + sex + " " + age + " "  + height + " " + isCard+ " "  + cart);
		
		String msg = """
				세상을 창조하여 (太上開天) 역사를 다스리고 (執符御歷) 
				진리를 행하여 (含眞體道) 미래를 밝게 비추고 (未來光明)
				우주를 관장하며 (九穹歷御) 만물의 법칙을 자연스럽게 다루고 (萬道無爲)
				드넓은 하늘의 거대하고 신성한 지혜의 금빛 궁전에 거하는 (通明大殿昊天金闕)
				운명을 주관하는 위대한 존재(運命大天尊)이자 
				신비롭고 굳센 가장 격이 높은 하늘신 (玄武高上帝)
				""";

		System.out.println(msg);
	}
}
