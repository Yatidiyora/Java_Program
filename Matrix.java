package com.prominent;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int N;
        System.out.println("please Enter the lenth of metrix");
        /*here we will ask user how much did they whant lendth of matrix using scanner class*/
        Scanner s = new Scanner(System.in);
        N=s.nextInt();
        int[][] A= new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                A[i][j]=3*i+2*j;
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++) {
               if(i==0){
                   System.out.print(A[i][j]+" ");
               }
            }
        }
        System.out.println("");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++) {
                if (j==1) {
                    System.out.print(A[i][j]+" ");
                }
                }
            }
        }


    }

