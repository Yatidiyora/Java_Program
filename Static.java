package com.prominent;

class Test2{
    static int x=10;
    int y=20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println(x);
    }
}

public class Static {
    public static void main(String[] args) {
        Test2 t1= new Test2();
        t1.show();
    }
}
