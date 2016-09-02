package com.practice.test;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time = "12:05:45AM";
		//String time = "12:05:45PM";
        String[] parts = time.split(":");
        String amPM = parts[2].substring(2, 4);
        parts[2] = parts[2].substring(0, 2);
        for(int i = 0; i < parts.length; i++){
            if(i==0){
                int hour = Integer.valueOf(parts[i]);
                if(hour != 12 && amPM.equals("PM")){
                    hour = hour+12;
                }else if(hour == 12 && amPM.equals("AM")){
                	hour = 0;
                }
                if(hour < 10){
                	System.out.print("0"+hour+":");
                }else{
                	System.out.print(hour+":");
                }
            }else if(i == (parts.length - 1)){
                System.out.print(parts[i]);
            }else{
                System.out.print(parts[i]+":");
            }
        }
	}

}
