package t1_variable;

public class Test9 {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "하세요";
		String str3 = "홍길동";
		
		System.out.println(str1+str2);
		System.out.println(str1+"\t"+str2);
		System.out.println(str1+"\n"+str2);
		System.out.println(str1+"'s"+str2);
		System.out.println("안녕's 하세요"); //큰 따옴표"안 써짐
		System.out.println("안녕\"s 하세요"); //큰 따옴표"안 써짐
		System.out.println("안녕\\s 하세요"); //큰 따옴표"안 써짐
		 
		String a = "A";
		
	}
}
