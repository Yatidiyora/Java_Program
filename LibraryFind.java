package com.prominent;

import java.util.Scanner;

public class LibraryFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter current Date");
        int d2 = sc.nextInt();int m2 = sc.nextInt();int y2=sc.nextInt();
        System.out.println("please Enter Due date");
        int d1 = sc.nextInt();int m1 = sc.nextInt();int y1=sc.nextInt();
        if(y2>y1){
            System.out.println(10000*(y2-y1));
        } else if (y2<y1 || m2<m1 || m2==m1&&d2<=d1) {
            System.out.println(0);
        }else if(m1==m2){
            System.out.println(15 * (d2-d1));
        }else {
            System.out.println(500*(m2-m1));
        }
    }
}
