package Backjoon;

import java.util.Scanner;

public class Baekjoon3_1 {
	public static void main(String[] args) {
		//백준 2739번 구구단
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 1;
			while(i < 10) {
				int num = N * i;
				System.out.println(N + " * " + i + " = " + num);
				i++;
			}
	}
}