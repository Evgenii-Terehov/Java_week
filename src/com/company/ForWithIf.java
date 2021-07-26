package com.company;

public class ForWithIf {

    static String m = "Monday";
    static String t = "Tuesday";
    static String w = "Wednesday";
    static String th = "Thursday";
    static String f = "Friday";
    static String s = "Saturday";
    static String su = "Sunday";

    public static void main(String[] args) {
        for (int data = 1; data <= 7; data++){
            if (data == 1){
                System.out.println(m);
                for (int hour = 1; hour <= 24; hour++){
                    System.out.println(hour + " hour/s");
                }
            }else if (data == 2){
                System.out.println(t);
                for (int hour = 1; hour <= 24; hour++){
                    System.out.println(hour + " hour/s");
                }
            }else if (data == 3){
                System.out.println(w);
                for (int hour = 1; hour <= 24; hour++){
                    System.out.println(hour + " hour/s");
                }
            }else if (data == 4){
                System.out.println(th);
                for (int hour = 1; hour <= 24; hour++){
                    System.out.println(hour + " hour/s");
                }
            }else if (data == 5){
                System.out.println(f);
                for (int hour = 1; hour <= 24; hour++){
                    System.out.println(hour + " hour/s");
                }
            }else if (data == 6){
                System.out.println(s);
                for (int hour = 1; hour <= 24; hour++){
                    System.out.println(hour + " hour/s");
                }
            }else if (data == 7){
                System.out.println(su);
                for (int hour = 1; hour <= 24; hour++){
                    System.out.println(hour + " hour/s");
                }
            }
        }
    }
}

class TwoFormsOfFor{
    public static void main(String[] args) {
        int [] even = new int[10];
        for (int i = 0; i < 10; i++){
            even[i] = i*2 + 2;
        }
        for(int data : even){
            System.out.println(data);
        }
    }
}

class ZamenaInArray{
    public static void main(String[] args) {
        int [] first = {10, 20, 30, 50, 50};
        int [] second = new int[6];
        second = first;
        first[3] = 40;
        for(int res:second){
            System.out.println(res);
        }
    }
}


class DwumerniyArray{
    public static void main(String[] args) {
        int [][] arrayInArray = new int[3][4];

        for(int i = 0; i < arrayInArray.length; i++){
            for(int j = 0; j < arrayInArray[i].length; j++){
                arrayInArray[i][j] = i + j;

            }
        }
        for(int [] data:arrayInArray){
            for(int data_t: data){
                System.out.print(data_t + "\t");
            }
            System.out.println("\n");
        }
    }
}
