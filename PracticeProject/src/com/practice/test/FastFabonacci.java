package com.practice.test;

import java.math.BigInteger;

public class FastFabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 99999999;
		for(int i =0; i < n; i++)
		System.out.println(getFibonacci(i));
	}
	
	private static BigInteger getFibonacci(int n) {
	    BigInteger a = BigInteger.ZERO;
	    BigInteger b = BigInteger.ONE;
	    for (int i = 31 - Integer.numberOfLeadingZeros(n); i >= 0; i--) {
	        BigInteger d = a.multiply(b.shiftLeft(1).subtract(a));
	        BigInteger e = a.multiply(a).add(b.multiply(b));
	        a = d;
	        b = e;
	        if (((n >>> i) & 1) != 0) {
	            BigInteger c = a.add(b);
	            a = b;
	            b = c;
	        }
	    }
	    return a;
	}

}
