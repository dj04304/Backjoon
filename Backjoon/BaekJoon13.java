package Backjoon;

import java.util.Scanner;

public class BaekJoon13 {
	public static void main(String[] args) {
		// 백준 2588번 곱셈
				Scanner scanner = new Scanner(System.in);
				
				int A = 0;
				int B = 0;
				A = scanner.nextInt();
				B = scanner.nextInt();
				//A = scanner.nextInt();
				System.out.println((A % 10) * B);
				System.out.println(((A % 100)/10) * B);
				System.out.println(((A - (A % 100))/100) * B );
				System.out.println(A * B);
				
		
				
	}
}