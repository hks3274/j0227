package t2_opreator;


//3항 연산자(조건식? 참:거짓)
public class Test3 {

	public static void main(String[] args) {
		//90점 이상이면 'A', 90점 미만은 'B'로 처리
		
		char res;
		int j = 62;
		
		res = (j >= 90) ? 'A' : 'B';
			
		System.out.println("점수 " + j+"점은 "+res+"학점 입니다.");	
		
	}

}
