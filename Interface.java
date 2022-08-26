package com.prominent;

interface Member{
    void Name();
    void Age();
    void Phone_number();
    void Address();
    void Salary();
}

class Employee implements Member{

    public void Name() {
        System.out.println("xyz");
    }
    public void Age() {
        System.out.println("22");
    }
    public  void Phone_number(){
        System.out.println("125487898");
    }
    public void Address(){
        System.out.println("Address");
    }
    public void Salary(){
        System.out.println("50,000");
    }
    public void Specialization(){
        System.out.println("10 hours");
    }
}

class Manager implements Member{
    public void Name() {
        System.out.println("xyz");
    }
    public void Age() {
        System.out.println("22");
    }
    public  void Phone_number(){
        System.out.println("125487898");
    }
    public void Address(){
        System.out.println("Address");
    }
    public void Salary(){
        System.out.println("70,000");
    }
    public void Department(){
        System.out.println("8 hours");
    }
}

public class Interface {
    public static void main(String[] args) {
        Member m1 = new Employee();
        m1.Name();
        m1.Age();
        m1.Address();
        m1.Salary();m1.Phone_number();
        Member m2 = new Manager();
        m2.Name();
        m2.Age();
        m2.Salary();
        m2.Address();
        m2.Phone_number();
    }
}
