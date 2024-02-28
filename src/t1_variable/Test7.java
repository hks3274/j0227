package t1_variable;


//자동 타입변환
public class Test7 {

	public static void main(String[] args) {
		int su1 = 100;
		double su2 = 3.14;
		
		su1 = su1+ 200;
		System.out.println("su1 :" + su1);
		
		su2 = su1 + su2; //double타입으로 자동변환된다.
		System.out.println("su2 :" +su2);
		
		double result;
		result = su2 + su1;//double타입으로 자동변환된다.
		
		System.out.println("result :"+result);
		
		int atom;
		atom = 1+2*3; //연산 우선순위도 있음
		System.out.println("atom :"+ atom);
		
		char cc1 = 'A';
		int res2 = cc1+1;
	
		System.out.println("res2 :"+ res2);
		System.out.printf("res2 : %d\n", res2);
		System.out.printf("res2 : %c\n", res2);
		System.out.println();
		
		String ss1 = "안녕하세요.";
		System.out.println("ss1 :"+ss1);
		System.out.printf("ss1 :%s\n", ss1);
		
		double dd1 = 3.141592;
		System.out.printf("dd1 : %f\n", dd1);
		System.out.printf("dd1 : %.2f\n", dd1);
		System.out.printf("dd1 : %6.2f\n", dd1); //콤마 앞에는 전체 숫자를 의미
	}
}
