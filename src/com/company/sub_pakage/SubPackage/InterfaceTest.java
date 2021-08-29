package com.company.sub_pakage.SubPackage;

public interface InterfaceTest {
    int DIST = 25;
    int mult(int a);
    double div(double b);
}

class Impl implements InterfaceTest{
    @Override
    public int mult(int a){
        if(a < 3){
            return (a / 2);
        }
        return (a * 2);
    }
    @Override
    public double div(double b){
        return (b / 5);
    }
}

class Output{
    public static void main(String[] args) {
        Impl out = new Impl();
        System.out.println(out.DIST);
        System.out.println(out.mult(2));
        System.out.println(out.div(30));
    }
}



