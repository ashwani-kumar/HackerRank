package com.practice.test;

public class BigIntegerSum {

	public static void main(String[] args) {
		int arr[] = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        Long sum = 0l;
        for(int arr_i=0; arr_i < arr.length; arr_i++){
            sum = sum + arr[arr_i];
        }
        System.out.print(sum);
	}

}
