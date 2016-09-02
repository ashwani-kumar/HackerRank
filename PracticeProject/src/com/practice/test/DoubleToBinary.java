package com.practice.test;

public class DoubleToBinary {
	public static void main(String[] args){
		double input = 0.444;
		String val = "0.";
		while(input > 0){
			double output = input * 2;
			if(output >= 1){
				val += "1";
				input = output - 1;
			}else{
				val += "0";
				input = output;
			}
		}
		System.out.println("binary "+val);
	}

}
