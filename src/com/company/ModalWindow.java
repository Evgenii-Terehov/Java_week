package com.company;

import javax.swing.JOptionPane;

public class ModalWindow {
    public static void main(String[] args) {
        int yearNow, yearBorn, userAge;
        String userData;
        userData = JOptionPane.showInputDialog("What year is it now?");
        yearNow = Integer.parseInt(userData);
        userData = JOptionPane.showInputDialog("What year you're born?");
        yearBorn = Integer.parseInt(userData);
        userAge = yearNow - yearBorn;
        JOptionPane.showMessageDialog(null, "You're age is " + userAge + " years!");
    }
}
