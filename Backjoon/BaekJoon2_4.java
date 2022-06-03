package Backjoon;

import java.util.Scanner;

public class BaekJoon2_4 {

	public static void main(String[] args) {
		/// 백준 14681번 사분면 고르기
		Scanner scanner = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		//어느 한쪽만이 아닌, 양쪽 다 충족시켜야 하기 때문에 &&를 써준다.
		
			if(A > 0 && B > 0) {//A 가 양수여야 하고, B도 양수여야 한다.
				System.out.println(1);
			}else if(A < 0 && B > 0) {//A 가 음수여야 하고, B는 양수여야 한다.
				System.out.println(2);
			}else if (A < 0 && B < 0) {//A 가 음수여야 하고, B도 음수여야 한다.
				System.out.println(3);
			}else if(A > 0 && B < 0) {//A 가 양수여야 하고, B는 음수여야 한다.
				System.out.println(4);
			}
		
			
	}

}
