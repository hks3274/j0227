package t3_control;

import java.util.Scanner;

//입력받은 수가 양수인지 정수인지 0인지 판별
public class Test4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("fdfdfd숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String str = null;

		if (num > 0) str = "양수";
		else if (num == 0) str = "0";
		else str = "음수"; 

		System.out.println("숫자 " + num + "은(는) " + str + "입니다!");

		sc.close();
	}
}
