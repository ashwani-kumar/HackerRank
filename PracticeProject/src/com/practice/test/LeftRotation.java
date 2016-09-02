package com.practice.test;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int input[] = new int[2];
        for(int i=0; i < 2; i++){
            input[i] = in.nextInt();
        }
        int rotation = input[1];
        int n = input[0];
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int tempArr[] = new int[n];
        System.arraycopy(arr, rotation, tempArr, 0, n-rotation);
        System.arraycopy(arr, 0, tempArr, n-rotation, rotation);
        for(int i = 0; i < n; i++){
          System.out.print(tempArr[i]+" ");
      }
        }

}
