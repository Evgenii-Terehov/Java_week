package com.company;

import javax.swing.JOptionPane;

class Cat {
    private String name;
    private String poroda;
    private int age;

    public Cat(String name, String poroda, int age){
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }

    public static void main(String[] args) {
        Cat Tom = new Cat("Tom", "Cheshir", 4);
        JOptionPane.showMessageDialog(null, "Name cat is " + Tom.name +
                "\n" + "age cat is " + Tom.age);
    }
}
