package t1_variable;

// 실수 자료형(float(4byte), double(8byte/정밀도 높은것도 처리할 수 있다))
public class Test4 {
	public static void main(String[] args) {
		double dd1, dd2;
		dd1 = 3.141592;
		dd2 = 3.141592656543435;
		System.out.println("dd1 : " + dd1);
		System.out.println("dd2 : " + dd2);
		System.out.println();
		
		float ff1, ff2;
		ff1 = 3.14f;//뒤에 f붙여줘야함(대소문자 관계x)
		System.out.println("ff1 : " + ff1);
		
		ff2 = 3.141592656543435f;
		System.out.println("ff2 : " + ff2);
		
		double dd3 = 5E3, dd4 = 5E-3;
		System.out.println("dd3 : " + dd3);
		System.out.println("dd4 : " + dd4);
		
	}
}
