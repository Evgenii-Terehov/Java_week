package com.company;

import jdk.dynalink.Operation;

public class Lambda {
    public static void main(String[] args) {
        Operationable operation; //Объявление ссылки на функциональный интерфейс
        //Тут могут быть объявлены параметры абстрактного метода (напр. int num = 9)

        operation = (x, y, z) -> ((x + y) / z); //реализация

        int result = operation.calculate(10,  20, 2);
        System.out.println(result);
    }
}

interface Operationable{
    int calculate(int x, int y,  int z);
}
