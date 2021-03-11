package com.harry;

class  base1{
    public base1() {
        System.out.println("This is a base class constructor");
    }
    public base1(int x) {
        System.out.println("This is a base class constructor value of x is : " + x);
    }
}

class derived1 extends base1{
    public derived1() {

        System.out.println("This is a derived class constructor");
    }
    public derived1(int x, int y) {
        super(x);
        System.out.println("This is a derived class constructor value of y is :"+y);
    }
}

class  basederived extends derived1{
    public basederived() {
        System.out.println("This is a basederived class constructor");
    }
    public basederived(int x, int y, int z) {
    super(x,y);
        System.out.println("This is a basederived class constunctor value of z is :"+z);
    }
}
public class Constructors_in_inhetritance {
    public static void main(String[] args) {
        //basederived  bd = new basederived();
        basederived  bd = new basederived(10,20,30);

    }
}
