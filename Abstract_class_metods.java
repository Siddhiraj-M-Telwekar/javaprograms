package com.harry;

abstract class Parent2{
    Parent2(){
        System.out.println("Mai ek constructor hoon");
    }
    public static void sayhello(){
        System.out.println("Hello");
    }
    abstract  public   void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{


    @Override
    public   void greet() {

        System.out.println("Good morning");
    }

    @Override
    public void greet2() {

        System.out.println("Good Afternoon");
    }
}

public class Abstract_class_metods {
    public static void main(String[] args) {
       Child2 ch2 = new Child2();
       Child2.sayhello();
    }
}
