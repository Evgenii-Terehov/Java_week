package com.company.sub_pakage.SubPackage;

//абстрактный класс-шаблон для наследования и расширения
//его другими классами

public abstract class AbstractClasses {
    String name;
    String color;
    int weight;
    AbstractClasses(String nm, String clr, int wt){
        name = nm; //name - это аргумент, nm - локальная переменная
        color = clr;
        weight = wt;
    }
    abstract void doAnimal();
}

abstract class Cat extends AbstractClasses {
    String poss;

    Cat(String nm, String clr, int wt, String ps) {
        super(nm, clr, wt);
        this.poss = ps;
    }

    @Override
    void doAnimal() {
    }
}

//класс наследник кот
class Cheshir extends Cat{

    Cheshir(String nm, String clr, int wt, String ps) {
        super(nm, clr, wt, ps);
    }

    @Override
    void doAnimal(){
        System.out.println("Cheshir name is " + name +
                ", color of cheshir is " + color + " and weight is "
                + weight + " kg.");
        System.out.println(name + " ловит мышей!" + "\n" + "А еще умеет " + poss + "\n");
    }
}

abstract class Dog extends Cat{
    Dog(String nm, String clr, int wt, String ps){
        super(nm, clr, wt, ps);
    }

    @Override
    void doAnimal() {
    }
}

class DoichlandDog extends Dog{
    String favorit;
    DoichlandDog(String nm, String clr, int wt, String ps, String fv) {
        super(nm, clr, wt, ps);
        this.favorit = fv;
    }
    @Override
    void doAnimal(){
        System.out.println(name + "\n" + color + "\n" + weight + "\n" + poss
                + "\n" + favorit);
    }


}


//тестовый класс вывода информации
class Test{
    public static void main(String[] args) {
        Cheshir objCat = new Cheshir("Барсик", "серый", 8, "муркать!");
        objCat.doAnimal();

        DoichlandDog objDog = new DoichlandDog("Шарик", "черно-серый ", 14, "рычать", "бегать за мячом!");
//        objDog.doAnimal();
    }
}


class ForImplementation implements InterfaceTest{
    @Override
    public int mult(int a){
        return (a * 9);

    }
    @Override
    public double div(double b) {
        return (b / 3);
    }
}

