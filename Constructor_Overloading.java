package com.harry;

class  student{
    int id,phy,chem,math;
    student(int i, int p, int c,int m){
        id = i;
        phy = p;
        chem = c;
        math = m;
        System.out.println("constructor executed");
    }
    student( int p, int c,int m){

        phy = p;
        chem = c;
        math = m;
        System.out.println("constructor 2 executed");
    }
}
public class Constructor_Overloading {
    public static void main(String[] args) {
        student rob = new student(1,60,76,89);
        System.out.println(rob.phy);

        student john = new student(80,80,80);
        System.out.println(john.chem);
    }
}
