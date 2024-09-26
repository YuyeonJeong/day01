package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num;
		num = input.nextInt();
		System.out.println("입력 값 : " + num);
		
		double dou;
		System.out.print("실수입력 : ");
		dou = input.nextDouble();
		System.out.println("입력 실수 :"+dou);
		
		String str;
		System.out.println("문자열 입력");
		str = input.next();
		System.out.println("입력 문자열 : "+str);
	}

}
