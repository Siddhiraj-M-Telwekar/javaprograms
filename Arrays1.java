package com.harry;

public class Arrays1 {
    public static void main(String[] args) {
        int [] marks = {89,39,49,59,69};
        System.out.println(marks.length);

        for(int i=0; i< marks.length;i++){
            System.out.println(marks[i]); // Array traversal
        }
        // for array print in reverse order
        System.out.println("print in reverse order");
        for(int i= marks.length -1;i>=0;i--){
            System.out.println(marks[i]);

        }

        // enhanced for loop
        System.out.println("It is a enhanced for loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
