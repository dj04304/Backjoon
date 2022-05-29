package Backjoon;

import java.util.Scanner;

public class BaekJoon12 {
	public static void main(String[] args) {
		// 백준 10430번 나머지
				Scanner scanner = new Scanner(System.in);
				
				int A = 0;
				int B = 0;
				int C = 0;
				
				A = scanner.nextInt();
				B = scanner.nextInt();
				C = scanner.nextInt();
				
				System.out.println((A + B) % C);
				System.out.println(((A % C) + (B % C)) % C);
				System.out.println((A * B) % C);
				System.out.println(((A % C) * (B % C)) % C);
				
	}
}