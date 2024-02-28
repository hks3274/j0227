package t2_opreator;

import java.io.BufferedReader;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//점수가 60점 이상은 합격, 60점 미만은 불합격
		
		Scanner sc = new Scanner(System.in); // 기본객체 안에 변수를 받아야 한다. 시스템이 알아서 받아달라고 하는거임, 입력받아주는 객체
		
		
		
		String str;
		int j = sc.nextInt();
		
		str = (j>= 60)? "합격" :"불합격";
		
		System.out.println("점수 "+j+"는 "+str+"입니다");
	}
}
