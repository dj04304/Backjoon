package Backjoon;

import java.util.Scanner;

public class BaekJoon8 {
	public static void main(String[] args) {
		//백준문제 1008번
		Scanner scanner = new Scanner(System.in);
		
		double a = 0; //결과에서 소숫점도 받아야 되기 때문에 double을 써준다.
		double b = 0; 
		
		a = scanner.nextInt(); // a의 입력을 받음
		b = scanner.nextInt(); // b의 입력을 받음
		
		System.out.println(a / b); // a X b 출력
		
		
		
	
	}
}