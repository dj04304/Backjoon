package Backjoon;

import java.util.Scanner;

public class BaekJoon9 {
	public static void main(String[] args) {
		//백준문제 10869번 사칙연산
		Scanner scanner = new Scanner(System.in);
		
		int a = 0; //결과에서 소숫점도 받아야 되기 때문에 double을 써준다.
		int b = 0; 
		
		a = scanner.nextInt(); // a의 입력을 받음
		b = scanner.nextInt(); // b의 입력을 받음
		
		System.out.println(a + b); // a + b 출력
		System.out.println(a - b); // a - b 출력
		System.out.println(a * b); // a * b 출력
		System.out.println(a / b); // a / b 출력
		System.out.println(a % b); // a b를 나눈 나머지 출력
		
		
		
	
	}
}