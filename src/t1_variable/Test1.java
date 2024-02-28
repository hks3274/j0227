package t1_variable;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("변수 연습");
		
		int num1 = 100;
		int num2 = 100;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + (num1+num2));
	
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		
		System.out.println("내 이름은 "+name+"이고 내나이는"+age+"살이야");
	}
}
