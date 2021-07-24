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
