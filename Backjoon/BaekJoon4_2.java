package Backjoon;

import java.util.Scanner;

public class BaekJoon4_2 {
	public static void main(String[] args) {
		//백준 2562번 최댓값
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt(), scanner.nextInt(), scanner.nextInt()
		};
		int count = 0; //최댓값의 수 위치
		int max = 0; // 최댓값
		int idx = 0; //count를 담을 변수
		
		for(int value : arr) { //foreach를 이용해 배열을 value에 담음
			count++;	//담을 때마다 count증가
			
			if(value > max) {
				max = value;
				idx = count;
			}
			
		}
		
		System.out.println(max + "\n" + idx);
	
	}
}