package Backjoon;

import java.util.Scanner;

public class BaekJoon3_14 {
	public static void main(String[] args) {
		//1110 백준 더하기 사이클
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //주어진 숫자
		int x = N;
		int i = 0; // 반복한 횟수
		
		while(true) {
			
			N = ((N % 10) * 10 + (((N / 10) + (N % 10)) % 10));
			i++;
		
			if(x == N) {
				break;
			}
		}
		System.out.println(i);
		
	}
}