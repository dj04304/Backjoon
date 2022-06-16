package Backjoon;

import java.util.Scanner;

public class BaekJoon3_10 {
	public static void main(String[] args) {
		//백준 2439번 별찍기 -2
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < (N - 1) - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
}