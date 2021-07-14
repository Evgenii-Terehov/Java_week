package com.company;

import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String surName;
        int yearBorn;
        int yearNow;
        System.out.println("Input you're name: ");
        name = input.nextLine();
        System.out.println("Input you're sur name: ");
        surName = input.nextLine();
        System.out.println("Input you're year born: ");
        yearBorn = input.nextInt();
        System.out.println("Input this year: ");
        yearNow = input.nextInt();
        System.out.println("Hello, " + name + " " + surName + "!");
        System.out.println("You's edge is " + (yearNow - yearBorn) + " years old!");
    }
}
