package com.prominent;

abstract class Super{
    public Super(){
        System.out.println("this is super");
    }
    public  void math1(){
        System.out.println("math1 of super");
    }
    abstract public void math2();
        }

        class Sub extends Super{
            @Override
            public void math2(){
                System.out.println("sub math2");
            }
        }


public class AbstactClass {
    public static void main(String[] args) {
        Super s = new Sub();
        s.math1();
        s.math2();
    }
}
