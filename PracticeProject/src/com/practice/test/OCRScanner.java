package com.practice.test;

public class OCRScanner {
	public static void main(String [] args){
		String a = "10ab";
		String str[] = a.split("");
		String num = "";
		int length = 0;
		for(int i = 0; i< str.length; i++){
			if(str[i].matches("^\\d+")){
				num = num + str[i];
			}else{
				length += Integer.parseInt(num);
			}
		}
		System.out.println(length);
	}

}
