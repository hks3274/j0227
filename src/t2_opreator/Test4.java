package t2_opreator;


//3항 연산자(조건식? 참:거짓)
public class Test4 {

	public static void main(String[] args) {
		//90점 이상이면 'A', 80이상이면 'b', 70점 이상 C 60점 이상 D 60이하 F
		
		char res;
		int j = 79;
		
		res = (j >= 90) ? 'A' : (j >= 80)? 'B': (j>=70)? 'C':(j>= 60) ? 'D': 'F';
			
		System.out.println("점수 " + j+"점은 "+res+"학점 입니다.");	
		
		
	}

}
