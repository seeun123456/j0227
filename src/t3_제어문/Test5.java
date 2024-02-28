package t3_제어문;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int su = 0;
		String res = "";
		
		System.out.print("점수를 입력하세요? ");
		su = sc.nextInt();
		
		if(su >= 90) {
			res = "A";
		}
		else if(su >= 80) {
			res = "B";
		}
		else if(su >= 70) {
			res = "C";
		}
		else if(su >= 60) {
			res = "D";
		}
		else {
			res = "F";
		}
		
		System.out.println("점수 "+ su + "는 " + res + "학점입니다.");
		sc.close();
	}
}