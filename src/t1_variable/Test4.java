package t1_variable;


//실수 자료형(float(4byte), double(8byte)) -> 정밀도 높을 것을 사용할려면 double을 사용해라
public class Test4 {
	public static void main(String[] args) {
		double dd1,dd2;
		
		dd1 = 3.141592;
		dd2 = 3.141592324535213132;
		
		System.out.println("dd1 : "+dd1);
		System.out.println("dd2 : "+dd2);
		
		float ff1,ff2;
		
		ff1 = 3.14f;
		ff2 = 3.1415925953392911234f; // 그냥 정밀도 낮게 사용하겠다. 사용되는 부분 이하로는 자름
		System.out.println("ff1 :"+ff1);
		System.out.println("ff2 :"+ff2);
		
		double dd3 = 5E3;
		System.out.println("dd3 :"+dd3);
	}
}
