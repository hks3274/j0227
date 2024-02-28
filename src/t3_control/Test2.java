package t3_control;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 점수가 60점 이상이면 합격 미만이면 불합격

		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 :");
		int su = sc.nextInt();
		String res = "";

		if (0 <= su && su <= 100) {
			if (su >= 60) {
				res = "합격";
			} else {
				res = "불합격";
			}
			System.out.println("점수 " + su + "는 " + res + "입니다.");
		} else {
			System.out.println("다시입력하세요.");
		}

		sc.close();
	}
}
