package t3_control;import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int su = 0;
		String res  = "";
		su = sc.nextInt();
		
		if(su >= 90) {
			res = "A";
		} else if(su >= 80) {
			res = "B";
		} else if(su >= 70){
			res = "C";
		} else if(su >= 60) {
			res = "D";
		} else res = "F";
		
		System.out.println("점수 " + su+"는 "+res+"입니다");
		
		sc.close();
	}

}
