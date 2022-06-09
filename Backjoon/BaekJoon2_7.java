package Backjoon;

import java.util.Scanner;

public class BaekJoon2_7 {
	public static void main(String[] args) {
		//백준 2480번 주사위 세개
		Scanner scanner = new Scanner(System.in);
		int Max = 0;
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(A == B && B == C) { // 3개의 숫자가 같을 때,
		
			System.out.println(10000 + A * 1000);
		
		}else if(A == B && B != C) { //2개의 숫자가 같을 때,
			
			System.out.println(1000 + A * 100);
			
		}else if(B == C && B != A){
			
			System.out.println(1000 + B * 100);
			
		}else if(A == C && A != B) {
			
			System.out.println(1000 + A * 100);
			
		}else if(A != B && B != C){ // 모두 다른 숫자일 때,
			if(A > B && A > C) {
				System.out.println(A * 100);
			}else if(A < B && B > C) {
				System.out.println(B * 100);
			}else {
				System.out.println(C * 100);
			}
		}
		
		
	}
}