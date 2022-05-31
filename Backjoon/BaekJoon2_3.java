package Backjoon;

import java.util.Scanner;

public class BaekJoon2_3 {

	public static void main(String[] args) {
		//백준 2753번 윤년
				Scanner scanner = new Scanner(System.in);
				int year = 0;
				year = scanner.nextInt();
				
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			
	}

}
