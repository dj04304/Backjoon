package Backjoon;

import java.util.Scanner;

public class BaekJoon4_3 {
	public static void main(String[] args) {
		//백준 2577번 숫자의 개수
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt(); //A B C 입력
		int result = A * B * C; //A B C의 곱의 결과
		
		int[] arr = new int[10]; //0 ~ 9 까지의 배열 선언
		
		while(result > 0) { // result 가 0 보다 클 때의 반복문
			arr[result % 10]++; //result의 10의 나머지 즉, 현재값의 1의자리숫자를 배열에 담아 증가시켜준다.
			result /= 10; //자릿수를 검사하기 위해 10씩 나눠서 없애준다.
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //배열에 담은 수를 출력
		}
	}
}