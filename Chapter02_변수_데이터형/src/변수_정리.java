import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class 변수_정리 {
	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis());
//		
//		File f= new File("C:\\javaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수_정리.java");
//		System.out.println(f.lastModified());
//		
//		System.out.println(new Date(f.lastModified()));
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
//
//		String name = JOptionPane.showInputDialog("이름 입력:");
//		System.out.println(name);
		
//		int kor=(int)(Math.random()*101);
//		int eng=(int)(Math.random()*101);
//		int math=(int)(Math.random()*101);
//		
//		System.out.println(kor +  " " + eng +  " " + math);
		
		Random r = new Random();
		int kor = r.nextInt(99,101);
		
		System.out.println(kor);
	}
}
