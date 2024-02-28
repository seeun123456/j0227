package t2_연산자;

import java.util.Scanner;

//점수가 90점 이상이면 'A', 80점 이상이면 'B', 점수가 70 이상이면 'C' ,점수가 60점이상이면'D',60점미만이면'F'
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char res;  
		int jumsu;
		
		System.out.print("점수를 입력하세요? ");
		jumsu = sc.nextInt();
		
		res = (jumsu >= 90) ? 'A' : (jumsu >= 80) ? 'B' :(jumsu >= 70) ? 'C' : (jumsu >= 60) ? 'D':'F';
		System.out.println("점수 : " + jumsu + " 은 " + res + " 학점 입니다.");
		
		sc.close();
	}
	
	
}
