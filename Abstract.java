package com.prominent;

import java.util.Scanner;

abstract class ArithmeticOperation{
    abstract double perform(int x,int y);
}

class Add extends ArithmeticOperation{

    @Override
    double perform(int x, int y) {
        return x+y;
    }
}
class Subt extends ArithmeticOperation{
    @Override
    double perform(int x, int y) {
        return x-y;
    }
}
class Div extends ArithmeticOperation{

    @Override
    double perform(int x, int y) {
        return x/y;
    }
}
class Mul extends ArithmeticOperation{

    @Override
    double perform(int x, int y) {
        return x*y;
    }
}

public class Abstract {
    public static void main(String[] args) {
        int x,y,i;
        System.out.println("please enter eny two number");
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("plese Enter your choise \n1.Add \n2.sub \n3.mul \n4.div");
        i=s.nextInt();
        switch (i){
            case 1:ArithmeticOperation a = new Add();
                System.out.println(a.perform(x,y));
                break;
            case 2:ArithmeticOperation b = new Subt();
                System.out.println(b.perform(x,y));
                break;
            case 3:ArithmeticOperation c =new Mul();
                System.out.println(c.perform(x,y));
                break;
            case 4:ArithmeticOperation d = new Div();
                System.out.println(d.perform(x,y));
        }


    }
}

