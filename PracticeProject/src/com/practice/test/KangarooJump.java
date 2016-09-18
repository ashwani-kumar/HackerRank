package com.practice.test;

import java.util.Scanner;

public class KangarooJump {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        while(true){
            if(v2 > v1){
                System.out.println("NO");
                break;
            }else{
                int posC1 = x1+v1;
                int posC2 = x2+v2;
                if(posC1 == posC2){
                    System.out.println("YES");
                    break;
                }else if(posC1 > posC2){
                    System.out.println("NO");
                    break;
                }else{
                    x1 = posC1;
                    x2 = posC2;
                }
            }
        }
    }
}
