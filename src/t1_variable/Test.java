package t1_variable;

import java.util.Scanner;

public class Test  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(), B = sc.nextInt();

		if (-10000 <= A && A <= 10000 && -10000 <= B && B <= 10000) {
			if (A > B) {
				System.out.println(">");
			} else if (A < B) {
				System.out.println("<");
			} else {
				System.out.println("=");
			}
		} else {
		  System.out.println("");
		}

	}
}
