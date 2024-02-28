package t2_연산자;

// 삼항 연산자 (조건식 ? 참 : 거짓)
public class Test3 {
	public static void main(String[] args) {
		// 점수가 90점 이상이면 'A', 90점 미만은 'B' 학점으로 처리 하시오.
		char res;
		int jumsu = 75;
		
		res = (jumsu >= 90) ? 'A' : 'B';
		System.out.println("점수 : "+jumsu+"은 "+res+" 학점 입니다.");
		
	}
}
