package com.company;

import javax.swing.JOptionPane;
import java.util.Random;

class RandomGame {
    public static void main(String[] args) {
        int secret = new Random().ints(1, 1, 11).findFirst().getAsInt();
        int userData;
        String userInput;
        int attempts = 0;
        while (true) {
            userInput = JOptionPane.showInputDialog(null, "Угадайте число от 1 до 10");
            try {
                userData = Integer.parseInt(userInput);

                if (userData == secret) {
                    JOptionPane.showMessageDialog(null, "ВЕРНО\nКоличество попыток " + attempts);
                    break;
                }else if(userData < 1 || userData > 10){
                    JOptionPane.showMessageDialog(null, "Выход за пределы от 1 до 10");
                }else{
                    attempts++;
                    JOptionPane.showMessageDialog(null, "ЛОЖЬ");
                }
            } catch (Exception e) {
                if (e.toString().contains("null")) {
                    System.exit(0);//можно написать break;
                }
                JOptionPane.showMessageDialog(null, "Недопустимое значение!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }finally {
                attempts++;
            }
        }
    }
}
