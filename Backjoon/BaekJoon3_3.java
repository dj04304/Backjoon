package Backjoon;

import java.util.Scanner;

public class BaekJoon3_3 {
	public static void main(String[] args) {
		//백준 8393번 합
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			result = result + (i + 1); 
		}
		
		System.out.println(result);
		
	}
}