package com.company;

class MyClass{
    int number;
    String letter;
    }
class MyMethod{
    public static void main(String[] args) {
        MyClass demo = new MyClass();
        demo.number = 123;
        demo.letter = "Set";
        System.out.println(demo.number);
        System.out.println(demo.letter);
    }
}

class MyNewClass{
    int summa(int a, int b){
        int summa = a + b;
        return summa;
    }
}
class Listing{
    public static void main(String[] args) {
        MyNewClass dego = new MyNewClass();
        int a =  dego.summa(5, 4);
        System.out.println(dego.summa(2,3));
        System.out.println(a);
    }
}


class Class {
    int summ(int a, int b) {
        int summ = a + b;
        return summ;
    }
}

class Ass{

    public static void main(String[] args) {
        Class demo = new Class();
        System.out.println(demo.summ(4, 6));
    }
}

class HelloClass{
    int numb = 10;
    String string = "string";
    int summa(int a, int b){
        int summa = a + b;
        return summa;
    }

    public static void main(String[] args) {

        HelloClass demo = new HelloClass();
        demo.numb = 11;
        System.out.println("That string " + demo.string + " and that is " + " number " + demo.numb);
        System.out.println("And that is sum 4 and 6 " + demo.summa(4, 6));
        System.out.println(demo.summa(4, 4) + demo.numb);
        }


    }

