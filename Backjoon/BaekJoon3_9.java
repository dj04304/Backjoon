package Backjoon;

import java.util.Scanner;

public class BaekJoon3_9 {
	public static void main(String[] args) {
		//백준 2438번 별찍기 -1
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
}