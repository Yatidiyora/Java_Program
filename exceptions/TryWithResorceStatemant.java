package com.prominent.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithResorceStatemant {
    public static void main(String[] args)throws Exception {
        try{
            System.out.println("please enter the number");
            int n;
            Scanner s= new Scanner(System.in);
            n = s.nextInt();
        }catch (Exception e){
            System.out.println(e);/*or u can use finnaly after catch block */
        }



    }
}
