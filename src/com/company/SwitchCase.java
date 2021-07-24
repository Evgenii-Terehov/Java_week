package com.company;

import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade){
            case 'B':
                System.out.println("To chto nado, this is B");
                break;

            case 'A':
                System.out.println("To chto nado, this is A");
                break;
            case 'S':
            System.out.println("To chto nado, this is S");
            break;

            default:
                System.out.println("Nichego ne sootvetstvuet");
                break;
        }

    }
}

class WithInputing {
    public static void main(String[] args) {
        int userData; //переменная для ввода пользовательского числа
        String userInput; //переменная для ввода пользовательской строки

        // выводим окно запроса числа
        userInput = JOptionPane.showInputDialog("Введите число от 1 до 3");

        // переводим введенную строку в число
        userData = Integer.parseInt(userInput);

        switch (userData){
            case 1:
                JOptionPane.showMessageDialog(null, "Вы ввели число 1");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Вы ввели число 2");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Вы ввели число 3");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Вы ввели некорректное число");
        }
    }
}

class WithIf {
    public static void main(String[] args) {
        int userData; //переменная для ввода пользовательского числа
        String userInput; //переменная для ввода пользовательской строки

        // выводим окно запроса числа
        userInput = JOptionPane.showInputDialog("Введите число от 1 до 3");

        // переводим введенную строку в число
        userData = Integer.parseInt(userInput);

        if ((userData >= 1) & (userData <= 3)) {
            JOptionPane.showMessageDialog(null, "Вы ввели число " + userInput);
        }

        else{
            JOptionPane.showMessageDialog(null, "Вы ввели не то число");

        }
    }
}