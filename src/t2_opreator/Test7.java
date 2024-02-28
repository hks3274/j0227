package t2_opreator;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		//점수가 60점 이상은 합격, 60점 미만은 불합격
		
		Scanner sc = new Scanner(System.in); // 기본객체 안에 변수를 받아야 한다. 시스템이 알아서 받아달라고 하는거임, 입력받아주는 객체
		//클래스변수, 객체변수
		
		char res;
		
		System.out.print("점수를 입력하세요 : ");
		int j = sc.nextInt();
		
		res = (j >= 90) ? 'A' : (j >= 80)? 'B': (j>=70)? 'C':(j>= 60) ? 'D': 'F';
			
		System.out.println("점수 " + j+"점은 "+res+"학점 입니다.");
		
		sc.close(); // 가비지 컬렉터가 확인을 못하므로 내가 알아서 끊어줘야 한다. 
	}
}