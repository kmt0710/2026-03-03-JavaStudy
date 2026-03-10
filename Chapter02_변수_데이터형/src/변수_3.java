
public class 변수_3 {
	public static void main(String[] args) {
		byte b1=Byte.MIN_VALUE;
		byte b2=Byte.MAX_VALUE;
		
		System.out.println("byte의 범위 " + b1 + "~" + b2);
		
		long l1 = Long.MIN_VALUE;
		long l2 = Long.MAX_VALUE;
		
		System.out.println("long의 범위 " + l1 + "~" + l2);
		
		short s1=Short.MAX_VALUE;
		short s2=Short.MIN_VALUE;
		
		System.out.println("short의 범위 " + s1 + "~" + s2);
		
		int i1 = Integer.MAX_VALUE;
		int i2 = Integer.MIN_VALUE;
		
		System.out.println("integer의 범위 " + i1 + "~" + i2);
		
		double d= 10.5f;
		float f = (float)10.5;
	}
}
