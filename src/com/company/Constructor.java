package com.company;

import javax.swing.*;

class Cat {
    private String name;
    private String poroda;
    private int age;

    Cat(String name, String poroda, int age){
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }

    public static void main(String[] args) {
        Cat Tom = new Cat("Tom", "Cheshir", 4);
        JOptionPane.showMessageDialog(null, "Name cat is " + Tom.name +
                "\n" + "age cat is " + Tom.age);

        Cat Jack = new Cat("Jack", "Hz", 6);
        JOptionPane.showMessageDialog(null, "Name cat is " + Jack.name +
                "\n" + "age cat is " + Jack.age);
    }

}

class Dog{

    static String animal = "TEST";

    static void showText(){
        JOptionPane.showMessageDialog(null,
                "Testoviy vvod static metoda" + "\n" + animal);
    }
    private static String fun = "testFun";
    private String name;
    private String poroda;
    private int age;

    public static void forFunMethod(String tst){
        fun = tst;
    }



    public Dog(String name, String poroda, int age) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }


    public static void main(String[] args) {
        Dog.showText();
        animal = "Test_FROG";
        Dog.showText();
        Dog Charly = new Dog("Charly", "Jack-russel", 14);
        JOptionPane.showMessageDialog(null, "Name dog is " +
                Charly.name + "\n" + "age dog is " + Charly.age + "\n" + "poroda is " +
                Charly.poroda + "\n" + Dog.animal);
    }
    public static void Dog (String[] args){
        Dog.showText();
    }

}

class Parent{
    String text;
    Parent(String text){
        this.text = text;
        System.out.println("Сработал конструктор Родительского класса " +
                "(эту строку можно создать только в методе или конструкторе)");
    }
}

class Child extends Parent{
    char letter;
    Child(String text, char letter){
        super(text);
        this.letter = letter;
    }
    void show(){
        System.out.println("text = " + this.text);
        System.out.println("char = " + this.letter);
    }
}

class ForChildClass{
    public static void main(String[] args) {
        Child demo = new Child("Hello", 'I');
        demo.show();
    }
}

class parent{
    String heTheBest;
    parent(String he){
        this.heTheBest = he;
    }
}

class child extends parent{
    String andItisCool;
    child(String he, String cool){
        super(he);
        this.andItisCool = cool;
    }
    void cow(){
        System.out.println(heTheBest + andItisCool);
    }
}

class Field{
    public static void main(String[] args) {
        child slow = new child("Эта часть до запятой - поле суперкласса",
                ", а эта часть - поле подкласса!");
        slow.cow();
    }
}


class A {
    public A() {
        System.out.print("A");
    }
}
class B extends A {
    public B() {
        System.out.print("B");
    }
}
class C extends B {
    public C() {
        System.out.print("C");
    }
    public static void main(String[] args) {
        C c = new C();
    }
}

class D{
    D(int i){
        System.out.print("Constructor A");
    }
}
//class Quest extends D{
//    public Quest(){}
//
//    public static void main(String[] args){
//        Quest quest = new Quest();}}