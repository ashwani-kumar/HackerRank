package com.practice.test;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escapeToken = -128;
		Scanner stdIn = new Scanner(System.in);
		int n = Integer.parseInt(stdIn.nextLine());
		int input[] = new int[n];
		for(int i=0; i < n; i++){
            input[i] = stdIn.nextInt();
        }
		for(int i = 0; i < n; i++){
			if(i==0){
				System.out.print(input[i]+" ");
			}else{
				int difference = input[i]-input[i-1];
//				if(difference == -127 || difference == 127){
//					difference = -128;
//				}
				System.out.print(difference+" ");
			}
		}
	}
	private static boolean anagrams(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		if (n1 != n2) {
			return false;
		}
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		int nr = 0;
		int[] asciiCharacters = new int[128];
		for (int i = 0; i < a.length; i++) {
			int c = a[i];
			asciiCharacters[c]++;
		}
		for (int i = 0; i < b.length; i++) {
			int c = b[i];
			asciiCharacters[c]--;
		}
		for (int i = 0; i < asciiCharacters.length; i++) {
			if (asciiCharacters[i] > 0) {
				return false;
			}
		}
		return true;
	}

		

}
