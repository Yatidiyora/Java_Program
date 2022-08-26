package com.prominent;

public class SubArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int B[] = new int[6];
        for(int i=4;i<10;i++){
            B[i-4]=A[i];
        }
        for(int i=0;i<=5;i++){
            System.out.println(B[i]);
        }

    }
}
