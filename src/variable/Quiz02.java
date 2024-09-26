package variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //입력받겠다
		
		System.out.print("당신의 이름은 무엇입니까? "); //출력
		String name; //변수
		name = input.next(); //이름 입력
		
		System.out.print(name+"님의 국어점수: "); //출력
		int korean; 
		korean = input.nextInt(); //국어점수 입력
		
		System.out.print(name+"님의 영어점수: ");
		int english;
		english = input.nextInt(); //영어점수 입력
		
		System.out.print(name+"님의 수학점수: ");
		int math;
		math = input.nextInt(); //수학점수 입력
		
		System.out.println("================");
		System.out.println("이름 : "+ name);
		System.out.println("================");
		System.out.println("국어 : "+ korean);
		System.out.println("영어 : "+ english);
		System.out.println("수학 : "+ math);
		System.out.println("================");
		System.out.println("합계 : "+ (korean+english+math)); //괄호꼭
		System.out.println("================");
				
	}

}
