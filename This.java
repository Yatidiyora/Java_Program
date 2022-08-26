package com.prominent;

class Test1{
    int i;
    void setvalue(int i){
        this.i=i;
        /**
         * here when I inithiat int i then the value of display is 0 and when i use this keyword then value will be 10
         */
    }
    void display(){
        System.out.println(i);
    }
}

public class This {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.setvalue(10);
        t.display();
    }
}
