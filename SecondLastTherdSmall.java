package com.prominent;

public class SecondLastTherdSmall {
    public static void main(String[] args) {
        int A[]={15,2,3,4,5,6,7,8,9,10,11,22,33,44,66,100,37,64,56,76,43,98,19,54};
        int l1=A[0],l2=A[0];
        int s1=A[0],s2=A[0],s3=A[0];
        for(int i=0;i<=A.length-1;i++){
            if(A[i]>l1){
                l1=A[i];
            } else if (A[i]>l2) {
                l2=A[i];
            }}


        for(int i=0;i< A.length;i++){
            if(A[i]<s1&&s1!=A[i]){
                s1=A[i];
            } else if (A[i]<s2&&s2!=A[i]) {
                s2=A[i];
            } else if (A[i]<s3&&s3!=A[i]) {
                s3=A[i];
            }
        }
        System.out.println(l2);
        System.out.println(s3);
        }

    }

