package Backjoon;

import java.util.Scanner;

public class BaekJoon2_2 {

	public static void main(String[] args) {
		//백준 9498번 시험 성적
		Scanner scanner = new Scanner(System.in);
		
			int score = 0;
			score = scanner.nextInt();
			
			if(score > 0 || score < 100) {
				if(score > 89) {
					System.out.println("A");
				}else if(score > 79) {
					System.out.println("B");
				}else if(score > 69) {
					System.out.println("C");
				}else if(score > 59) {
					System.out.println("D");
				}else {
					System.out.println("F");
				}
			}
			
	}

}
