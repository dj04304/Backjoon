package Backjoon;

import java.util.Scanner;

public class BaekJoon3_6 {
	public static void main(String[] args) {
		//백준 2742번 기찍 N
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println(N - i);
		}
		
	}
}