package com.company;

public class Equals { }

class Man {

    int dnaCode;
    String name;

    public boolean equals(Man man) {
        return this.dnaCode ==  man.dnaCode;
    }

    public static void main(String[] args) {

        Man man1 = new Man();
        man1.dnaCode = 1111222233;
        man1.name = "Poul";

        Man man2 = new Man();
        man2.dnaCode = 1111222233;
        man2.name = "Jake";

        if (man1.name == man2.name){
            System.out.println("ONE");
        }else{
            System.out.println("TWO");
        }
        System.out.println(man1.equals(man2));

    }
}