package com.company.sub_pakage.SubPackage;

import java.util.Arrays;

public class VariableArguments {
    public void method(int ... values){
        if(values.length != 0){
            System.out.println(Arrays.toString(values));
        }else{
            System.out.println("Array is without values");
        }
    }
    public void method(int a, int b){
        System.out.println(a + " " + b);
    }
}

class Values{
    public static void main(String [] args){
        VariableArguments arr = new VariableArguments();
        int [] arr1 = {6, 7, 8};
        arr.method(1, 2, 3, 4, 5);
        arr.method(arr1);
        arr.method(10, 20);

    }
}
