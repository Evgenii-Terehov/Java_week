package com.company;

import javax.swing.JOptionPane;
import java.util.Random;

class RandomGame {
    public static void main(String[] args) {
        Random rnd = new Random(System.currentTimeMillis());
        int secret = rnd.nextInt(11);
        int userData;
        String userInput;
        int attempts = 0;
        while (true){
            userInput = JOptionPane.showInputDialog(null, "Угадайте число от 1 до 10");
            userData = Integer.parseInt(userInput);
            if(userData == secret) {
                JOptionPane.showMessageDialog(null, "ВЕРНО\nКоличество попыток " +
                        attempts);
                break;
            }else if(userData == 99){
                JOptionPane.showMessageDialog(null, "Игра окончена");
                break;
            }else{
                attempts++;
                JOptionPane.showMessageDialog(null, "ЛОЖЬ");
            }
        }
    }
}
