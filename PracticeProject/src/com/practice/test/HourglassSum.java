package com.practice.test;

public class HourglassSum {

    public static void main(String[] args) {
        int arr [][] ={{3, 7, -3, 0, 1, 8},
        {1, -4, -7, -8, -6, 5},
        {-8, 1, 3, 3, 5, 7},
        {-2, 4, 3, 1, 2, 7},
        {2, 4, -5, 1, 8, 4},
        {5, -7, 6, 5, 2, 8}};
        int previousHourGlassSum;
        int minValueInArray = -9;
		int elementsInHourGlass = 7;
		int maxHourGlassSum = minValueInArray * elementsInHourGlass;
        int row = 6;
        int col =6;
        for(int i = 0; i < (row-2); i++){
        	for(int j =0; j < (col-2);j++){
        		previousHourGlassSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
        				arr[i+1][j+2]+
        				arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        		if(previousHourGlassSum > maxHourGlassSum){
        			maxHourGlassSum = previousHourGlassSum;
        		}
        	}
        }
        System.out.print(maxHourGlassSum);
    }
}