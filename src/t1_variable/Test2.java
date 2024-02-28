package t1_variable;

public class Test2 {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 010;//8진수
		int a3 = 0x10;//16진수
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println();
		
		
		int num = 10;//10진수 ,2진수 = 1010 (일공일공)
		
		String binaryNum = Integer.toBinaryString(num);	//toBinaryString = 2진수로 변환해주는것
		String octalNum = Integer.toOctalString(num); //toBinaryString = 8진수로 변환
		String hexNum = Integer.toHexString(num); // 16진수로 변환
		
		System.out.println("10진수 num : " + num);
		System.out.println("2진수 binaryNum : " + binaryNum);
		System.out.println("8진수 octalNum : " + octalNum);
		System.out.println("16진수 hexNum : " + hexNum);
	}
}
