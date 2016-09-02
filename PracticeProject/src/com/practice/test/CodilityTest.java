package com.practice.test;

import java.util.Scanner;

public class CodilityTest {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		int A[] = new int[8]; 
		for(int i = 0; i < 8; i++){
			A[i] = s.nextInt();
		}
		CodilityTest mCodilityTest = new CodilityTest();
		int result = mCodilityTest.solution(A);
		System.out.println(result);
	}
	
	int solution(int[] A) {
	        int n = A.length;
	        int result = 0;
	        int r = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (A[i] == A[i + 1]){
	            	result = result + 1;
	            }
	                
	            int count = 0;
	            if (i > 0) {
	                if (A[i - 1] != A[i])
	                    count = count + 1;
	                else
	                    count = count - 1;
	            }
	            if (i < n - 1) {
	                if (A[i + 1] != A[i])
	                    count = count + 1;
	                else
	                    count = count - 1;
	            }
	            r = Math.max(r, count);
	        }
	        return result + r;
	    }
}
