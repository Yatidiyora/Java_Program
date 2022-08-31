package Prominent;

import java.io.*;


class Superclass {
    int i;    //here the Superclass variable i declared
    public Superclass(int i){
        this.i = i;    //here inside the inherite class there is some peramiter given and that paramiter will be stored in that variable i using this keyword

    }
    public Superclass(){
        i = 50;  //here i is difrant then the parameterized class
        System.out.println("Super class constructor called");
    }
}
class Subclass extends Superclass implements Serializable{
    int j;             //here the subclass is extends the superclass and it's also implements Serializable
    public Subclass(int i, int j) { //here two paramiter is given i and j
        super(i);                  // here the using super key word the super class variable i is called
        this.j = j;
    }
}

public class Serialization {
    public static void main(String[] args) throws Exception {
        Subclass b1 = new Subclass(10,20);
        System.out.println("j = "+b1.i);
        System.out.println("j = "+b1.j);
        FileOutputStream fos = new FileOutputStream("abc.ser");  //here create new object stream using java.io libraries
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(b1);
        oos.close();                                                   //here close the fileoutputstream
        fos.close();                                                    //here close the objectoutputstream
        System.out.println("Object has been serialized");
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Subclass b2 = (Subclass) ois.readObject();
        ois.close();
        fis.close();
        System.out.println("Object has been deserialized");
        System.out.println("i = "+b2.i);
        System.out.println("j = "+b2.j);
    }
}
