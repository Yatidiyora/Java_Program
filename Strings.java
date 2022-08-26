package com.prominent;

public class Strings {
    public static void main(String[] args) {
        StringBuffer str1=new StringBuffer("Yatin");
        str1.append(" Diyora");
        System.out.println(str1);
        str1.replace(4,5,"h");
        System.out.println(str1);
        String str2=new String("Yati Diyora");
        String str3=str2.replaceAll("\\s","");
        System.out.println(str3);
        String str4=new String();
        for(int i=str1.length()-1;i>=0;i--){
            str4=str4+str1.charAt(i);
        }
        System.out.println(str4);
    }
}
