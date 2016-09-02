package com.practice.test;

import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = Integer.parseInt(stdIn.nextLine());
		String input[] = new String[n];
		for(int i=0; i < n; i++){
            input[i] = stdIn.nextLine();
        }
		int m = Integer.parseInt(stdIn.nextLine());
		String query[] = new String[m];
		for(int i=0; i < m; i++){
			query[i] = stdIn.nextLine();
        }
		
		for(int i = 0;i < m; i++){
			int count = 0;
			for(int j = 0;j < n; j++){
				if(input[j].equals(query[i])){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
