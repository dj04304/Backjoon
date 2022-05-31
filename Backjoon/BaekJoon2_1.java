package Backjoon;

import java.util.Scanner;

public class BaekJoon2_1 {

	public static void main(String[] args) {
		//백준 1330 두 수 비교하기.
		Scanner scanner = new Scanner(System.in);

		int A = 0;
		int B = 0;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else{
			System.out.println("==");
		}
		
	}

}
