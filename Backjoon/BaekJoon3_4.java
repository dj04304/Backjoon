package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon3_4 {
	public static void main(String[] args)  throws IOException{
		//백준 15552번 빠른 A + B
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bufferedReader.readLine());
		
		StringTokenizer stringTokenizer;
		
		for(int i = 0; i < T; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			bufferedWriter.write((Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken())) + "\n");
		}
		
		bufferedReader.close();
		
		bufferedWriter.flush();
		bufferedWriter.close();
		
	}
}