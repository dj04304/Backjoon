package Backjoon;

import java.util.Scanner;

public class BaekJoon3_11 {
	public static void main(String[] args) {
		//백준 10871번 X보다 작은 수
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); // 배열의 크기
		int X = scanner.nextInt(); // 기준되는 정수
		int arr[] = new int[N]; //배열의 크기 N을 담은 배열을 선언
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt(); //N 만큼 반복한 배열을 입력받음
		}
		
		for(int i = 0; i < N; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i] + " "); //입력받은 배열이 X 보다 작을 때, 출력
			}
		}
		
	}
}