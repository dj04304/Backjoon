package Backjoon;

import java.util.Scanner;

public class BaekJoon2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		int C = scanner.nextInt();
		
		int num = (H*60) + M + C;
		
		H = num/60;
		M = num%60;
		
		if(H > 23) {
			H = H - 24;
		}
		
		System.out.println(H + " " + M);
		
	}
}
