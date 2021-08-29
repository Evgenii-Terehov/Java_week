package com.company.sub_pakage.SubPackage;
interface MyInterface{
    void show();
}
public class InterfaceVariable implements MyInterface {
    int number;
    InterfaceVariable(int a){
        number = a;
    }
    @Override
    public void show(){
        System.out.println(number);
    }
    public void showDouble(){
        System.out.println(number * 2);
    }
}
class Second{
    public static void main(String[] args) {
        MyInterface ref; //Это интерфейсная переменная
        ref = new InterfaceVariable(5);
        ref.show();
        InterfaceVariable obj = new InterfaceVariable(6);
        ref = obj;
        ref.show();
        obj.show();
        obj.showDouble();
    }
}
