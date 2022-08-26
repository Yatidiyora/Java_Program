package com.prominent;



public class RecursiveString {
    public static int strDist(String str,String sub){
        if(str.length()<sub.length())return 0;
        if(str.substring(0,sub.length()).equals(sub)){

            //check if the string ends with the substring, if so return the length of the string
            if(str.substring(str.length() - sub.length(),str.length()).equals(sub)){
                return str.length();
            }

            //if the above condition fails, shave the last charater of the string and recurse
            return strDist(str.substring(0,str.length()-1),sub);
        }

        //keep searching for the substring to appear in the string
        return strDist(str.substring(1),sub);
    }
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
    }
}
