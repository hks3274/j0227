package t1_variable;

public class Test3 {

	public static void main(String[] args) {
		
		//정수형 타입(byte, char, short, int, long)
		byte bb, bb2;
		bb = 127;
//		bb = 128; byte 타입의 수치 표현 범위: -127~128;
		
		bb2 = -128;
//		bb2 = -129;
		
		System.out.println("bb1 = "+bb);
		System.out.println("bb2 = "+bb2);
		System.out.println();
		
		short ss1,ss2,ss3,ss4;
		
		ss1 = 128;  
		ss2 = -129;
		System.out.println("ss1 :" +ss1);
		System.out.println("ss2 :" +ss2);
		
//		ss3 = 33000;
		int ii1 = 33000;
		System.out.println("ii1 :"+ii1);
		
		int ii2 = 2100000000;
		System.out.println("ii2 :"+ii2);
		
		
		long ll = 2200000000l; //long은 l을 붙여야 한다. 가독성있게 붙인것이 관례가 된것이다. 이건 몰랐으니 기억하자!
		System.out.println("ll :"+ll);
		
		//char는 왜 정수로 분류로 해놓는냐.. 문자가 들어가면 숫자로 들어가기 때문(아스키 코드라고 생각하자)
		
		char cc1 = 'A';
		int cc2 = 'A'; //아스키코드 65 
		char cc3 = 'a';
		int cc4 = 'a'; //아스키코드 65 
				
		System.out.println("cc1 :"+ cc1);
//		System.out.printf("cc1 : %d\n",cc1);
		System.out.println("cc2 :"+ cc2);
		System.out.println("cc3 :"+ cc3);
	  System.out.println("cc4 :"+ cc4);
	  
	  char cc5 = '한';
	  int cc6 = '한';
	  System.out.println("cc5 :"+cc5);
	  System.out.println("cc6 :"+cc6);
	  
	  char cc7 = '\u0041';
	  System.out.println("cc7 :"+cc7);
	  
	}
}
