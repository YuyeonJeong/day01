package variable;

import java.util.Scanner;

public class Quiz02Practice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		String name;
		name = input.next();
		
		System.out.print(name+"님의 국어점수 : ");
		int korean;
		korean = input.nextInt();
		
		System.out.print(name+"님의 영어점수 : ");
		int english;
		english = input.nextInt();
		
		System.out.print(name+"님의 수학점수 : ");
		int math;
		math = input.nextInt();
		
		System.out.println("==============");
		System.out.println("이름 : "+name);
		System.out.println("==============");
		System.out.println("국어 : "+korean);
		System.out.println("영어 : "+english);
		System.out.println("수학 : "+math);
		System.out.println("==============");
		System.out.println("합계 : "+(korean+english+math));
		System.out.println("==============");
	}

}
