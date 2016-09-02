package com.practice.test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PlusMinus {

	public static void main(String[] args) {
		int arr[] = {0, 100, 35, 0, 94, 40, 42, 87, 59, 0};
		int n = 10;
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            if(arr[arr_i] > 0){
                positiveCount++;
            }else if(arr[arr_i] < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        df.setRoundingMode(RoundingMode.CEILING);
        if(positiveCount > 0){
        	double fraction = (double) positiveCount/n;
        	System.out.println(df.format(fraction));
        }else{
        	System.out.println("0.000000");
        }
        if(negativeCount > 0){
        	double fraction = (double) negativeCount/n;
        	System.out.println(df.format(fraction));
        }else{
        	System.out.println("0.000000");
        }
        if(zeroCount > 0){
        	double fraction = (double) zeroCount/n;
        	System.out.println(df.format(fraction));
        }else{
        	System.out.println("0.000000");
        }
	}
}
