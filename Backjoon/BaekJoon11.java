package Backjoon;

import java.util.Scanner;

public class BaekJoon11 {
	public static void main(String[] args) {
		// 백준 18108번 1998년생인 내가 태국에서는 2541년생?! 
				Scanner scanner = new Scanner(System.in);
				
				int year = 0; // 입력할 불기
				int	year2 = 543; //서기년도와 불기년도가 543만큼 차이나기 때문에 불기 - 543 = 서기년도가 된다
				
				year = scanner.nextInt();
				System.out.println(year - year2); 
		
	}
}