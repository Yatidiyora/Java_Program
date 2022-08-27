package com.prominent.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
class Error extends Exception{
    public String toString(){
        return "Invalide ElasticSearch port configuration";
    }
}


public class WayToHandaleExceptions {
    public static void main(String[] args) throws Error {
        int value;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter right number");

            try {
                value = s.nextInt();
                if (value > 65000 ) {
                    throw new Error();

                }else
                    System.out.println("You Enter right number");
            }catch (Error e){
                System.out.println(e);
            }catch (InputMismatchException e){
                System.out.println("Invalide ElasticSearch port configuration");
            }


    }
}
