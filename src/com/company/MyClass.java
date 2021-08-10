package com.company;

import java.security.PublicKey;

public class MyClass{
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
        return a + b;
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
        return a + b;
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
        return a + b;
    }

    public static void main(String[] args) {

        HelloClass demo = new HelloClass();
        demo.numb = 11;
        System.out.println("That string " + demo.string + " and that is " + " number " + demo.numb);
        System.out.println("And that is sum 4 and 6 " + demo.summa(4, 6));
        System.out.println(demo.summa(4, 4) + demo.numb);
        }
    }

class Test {
    int b, a = 10;
    public static void main(String[] args) {
        Test demo = new Test();
        demo.b = (demo.a > 5) ? 50 : 60;
        System.out.println(demo.b);
    }
}

class Logger{
    private String format = "str";
    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format = format;
        System.out.println(format);
    }
}
class Result{
    public static void main(String[] args) {
        Logger demo = new Logger();
        System.out.println(demo.getFormat());
    }
}

class MyClasss {
    // статическое числовое поле
    static int number=5;
    // статическое текстовое поле
    static String text="Hello";
    // статическй метод (вывод текста на печать)
    static void showText () {
        System.out.println (text);
    }
    // статический метод (вывод числа на печать)
    static void showNumber () {
        System.out.println (number);
    }
}
class Listing6_6 {
    public static void main (String [] args) {
// прямое обращение к статическим методам
// без создания объекта класса
        MyClasss.showText ();
        MyClasss.showNumber ();
// прямое обращение к статическим полям
// без создания объекта класса
        MyClasss.number=15;
        MyClasss. text="Java";
// проверяем, изменились ли статические поля
// после прямого обращения
        MyClasss.showText ();
        MyClasss.showNumber ();
// создаем объект класса
        MyClasss obj=new MyClasss ();
// обращаемся к статическим полям
// в качестве полей объекта
        obj.showText ();
        obj.showNumber ();
    }
}

class Testts{
    final int value = 10;
    static final int BOX = 6;
    public static final String TITLE = "Manager";

    public static void change(String [] args){
       /*  будет получена ошибка пo всем трем примерам, так как
    изменить значения с модификатором final нельзя
        value = 2;
        BOX = 1;
        TITLE = "Master";
        */
    }
}