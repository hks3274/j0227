package t2_opreator;

public class Test1 {
	public static void main(String[] args) {
		int su = 0 ;
		
		su = su +1;
		System.out.println("su1 :"+ su);
		
		su += 1;
		System.out.println("su1 :"+ su);
		
		su++;
		System.out.println("su1 :"+ su);
		
		++su;
		System.out.println("su1 :"+ su);
		System.out.println("===================================");
		
		int res = 0;
		res = su;
		System.out.println("6.su : "+su+", res : "+res);
		
		
		res = ++su + 10;
		System.out.println("7.su : "+su+", res : "+res);
		
		res = su++ + 10;
		System.out.println("8.su : "+su+", res : "+res);
		
		res = --su + 10;
		System.out.println("9.su : "+su+", res : "+res);
		
		res = su-- + 10;
		System.out.println("9.su : "+su+", res : "+res);
		
		res = ++su + su-- + 10; //su:4 res:20
		System.out.println("9.su : "+su+", res : "+res);
		
		
	}
	
}
