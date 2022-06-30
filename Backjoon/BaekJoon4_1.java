package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon4_1 {
	//백준 10818번 최소, 최대
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int[] arr = new int[N];

		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = scanner.nextInt();
			
		}
		
		Arrays.sort(arr); //배열의 값을 크기 순서대로 나열해주는 메소드
		System.out.println(arr[0] + " " + arr[N - 1]);
			
	}
}