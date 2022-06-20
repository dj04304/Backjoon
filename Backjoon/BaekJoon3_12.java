package Backjoon;

import java.util.Scanner;

public class BaekJoon3_12 {
	public static void main(String[] args) {
		//백준 10952번 A + B -5
		Scanner scanner = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		while(true) {
			A = scanner.nextInt();
			B = scanner.nextInt();			
			
			if(A == 0 && B == 0) {
				
					break;
				
			}		
			System.out.println(A + B);
		}
		
	}
}