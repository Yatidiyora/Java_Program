package com.prominent;

import java.sql.SQLOutput;

public class Kpatern {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=9;j++){
                if(j>=5-i&&j<=9-2*i) {
                    System.out.print("* ");
                }else if(j==0){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=3;i>=0;i--){
            for(int j=0;j<=9;j++){
                if(j>=5-i&&j<=9-2*i){
                    System.out.print("* ");
                }else if(j==0){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
