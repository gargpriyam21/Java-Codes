package Extras;

import java.util.Scanner;

class child{
    String str;
    child(){
    System.out.println("child's constructor called");
    str="child's string"; 
    }
    void print(){
    System.out.println("child's method called");
    System.out.println("String = "+str); 
    }
}

class parent extends child{
    String str;
    parent(){
    super();
    System.out.println("parent's constructor called");
    str="parent's string";   
    }
    void print(){
    System.out.println("parent's method called");
    System.out.println("String = "+str);    
    super.print();
    }
}

class Queue{
    public static void main(String args[]){
    parent obj=new parent();
    obj.print();    
    }
}  

