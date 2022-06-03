package Backjoon;

import java.util.Scanner;

public class BaekJoon2_5 {

	public static void main(String[] args) {
		/// 백준 14681번 사분면 고르기
		// 백준 2884번 문제 알람시계
				Scanner scanner = new Scanner(System.in);
				int H = 0;
				H = scanner.nextInt();
				int M = 0;
				M = scanner.nextInt();
				
				if(M < 45) { // 분의 값이 45분보다 작을 때
					H--; //시간 감소
					
					M = 60 - (45 - M); // 45에 받은 값을 빼준 값을 다시 60을 빼줘야 한다.
				
					if(H < 0) { // 0시보다 작을 때 마이너스 값이 아닌 23시로 가야된다.
						H = 23;
					}
					
					System.out.println(H + " " + M); //시간 출력
					
				}else{// 분의 값이 45분보다 클 때
					
					System.out.println(H + " " + (M - 45)); //45분보다 크기 때문에 M - 45 를 해야한다.
					
				}
				
			
	}

}
