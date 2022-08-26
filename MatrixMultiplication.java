package com.prominent;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(A[i][j]*B[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
