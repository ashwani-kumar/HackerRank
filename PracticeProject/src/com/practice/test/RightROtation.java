package com.practice.test;

import java.util.Scanner;

public class RightROtation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int rotations = in.nextInt();
        int queryCount = in.nextInt();
        int input[] = new int[length];
        for(int i=0; i < length; i++){
            input[i] = in.nextInt();
        }
        int query[] = new int[queryCount];
        for(int arr_i=0; arr_i < queryCount; arr_i++){
            query[arr_i] = in.nextInt();
        }
        int tempArr[] = new int[length];
        System.arraycopy(input, length-rotations, tempArr, 0, rotations);
        System.arraycopy(input, 0, tempArr, rotations, length-rotations);
        for(int arr_i=0; arr_i < queryCount; arr_i++){
            System.out.println(tempArr[query[arr_i]]);
        }
	}

}
