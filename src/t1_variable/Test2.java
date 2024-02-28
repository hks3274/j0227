package t1_variable;


public class Test2 {

	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 010;
		int a3 = 0x10;
		
		System.out.println("a1 :"+a1);
		System.out.println("a2 :"+a2);
		System.out.println("a3 :"+a3);
		System.out.println();
		
		
		int num = 10;
		String bin = Integer.toBinaryString(num); //2진수로 변환
		String oc = Integer.toOctalString(num); // 8진수로 변환
		String hex = Integer.toHexString(num); // 16진수로 변환
				
		System.out.println("10진수 : " + num);
		System.out.println("2진수 : " + bin);
		System.out.println("8진수 : " + oc);
		System.out.println("16진수 : " + hex);
		System.out.println("출력되었습니다");
	}

}
