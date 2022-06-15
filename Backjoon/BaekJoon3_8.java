package Backjoon;

import java.util.Scanner;

public class BaekJoon3_8 {
	public static void main(String[] args) {
		//백준 11022번 A + B -8
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			int result = A + B;
			
			System.out.println("Case #" + (i + 1) + ": " + A + " + " + B  + " = " + result);
		}
		
	}
}