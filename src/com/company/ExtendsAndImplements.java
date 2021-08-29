package com.company;

public class ExtendsAndImplements {
}

interface One{
    default void multiply(int a){//метод по умолчанию, вызывается,
                                // если метод не вызван явно из имплементирующего класса
        System.out.println("Использован метод из интерфейса One " + (a * 1));
    }
}

interface Two{
    int divide(int b);//объявление метода
}

class ParentExt{
    ParentExt(int f){//родительский конструктор
        System.out.println("Использован РОДИТЕЛЬСКИЙ метод " + (f * 10));
    }
    void minus(int c, int d){
        System.out.println("Родительский метод minus " + (d - c));}
}

class ChildExt extends ParentExt implements One, Two{
    int d;
    ChildExt(int c, int d){
        super(c);//в родительском классе стоит f, это говорит,
        // что не важно какое название переменной, ключевое слово super() означает,
        // что используется переменная родительского класса
        this.d = d;
    }
    ChildExt(int c){
        super(c);
    }

    void plus(int c, int d){
        System.out.println("Дочерний метод plus " + (d + c));
    }

    @Override
    public int divide(int b) {
        return (b / 2);
    }
}

class outputExt{
    public static void main(String[] args) {
        ParentExt pRes = new ParentExt(50);
        ChildExt cRes = new ChildExt(50);
        cRes.plus(10, 20);

        pRes.minus(10,20);

        One showOne;
        showOne = new ChildExt(10);
        showOne.multiply(30);

        Two showTwo;
        showTwo = new ChildExt(40, 50);
        int show = showTwo.divide(70);
        System.out.println("Использован метод из интерфейса Two " + show);
    }
}
