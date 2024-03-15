package org.example;

public class Calculator extends Main {
    public int add(int a,int b){
        return a+b;
    }
    public String getName(String name) throws Exception {
        if(name.length()>3){
            return name.substring(3);
        }else{
            throw new Exception("String is empty");
        }
    }
}
