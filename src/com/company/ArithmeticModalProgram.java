package com.company;
import javax.swing.JOptionPane;
public class ArithmeticModalProgram {

    int inpOne, inpTwo;

    void set(int a, int b){
        inpOne = a;
        inpTwo = b;
    }

    int sum(){
        return inpOne + inpTwo;
    }
    int proiz(){
        return inpOne * inpTwo;
    }



    public static void main(String[] args) {
        int in_a, in_b;
        String userInput;
        ArithmeticModalProgram outPut = new ArithmeticModalProgram();

        userInput = JOptionPane.showInputDialog("Введите число a");
        in_a = Integer.parseInt(userInput);

        userInput = JOptionPane.showInputDialog("Введите символ b");
        in_b = Integer.parseInt(userInput);

//        String toDo = JOptionPane.showInputDialog("Напишите 'sum', для сложения и 'proizv' для умножения");

        outPut.set(in_a, in_b);

        JOptionPane.showMessageDialog(null, "Сумма чисел " + in_a + " и " + in_b + " равна " + outPut.sum());
        JOptionPane.showMessageDialog(null, "Произведение чисел " + in_a + " и " + in_b + " равно " + outPut.proiz());
        //        if(toDo == "sum"){
//
//            JOptionPane.showMessageDialog(null, "Сумма чисел" + in_a + " и " + in_b + "равна " + outPut.sum());
//
//        }else if(toDo == "proizv"){
//
//            JOptionPane.showMessageDialog(null, "Произведение чисел" + in_a + " и " + in_b + "равно " + outPut.proiz());
//
//        }else{
//            JOptionPane.showMessageDialog(null, "Произошла ошибка");
//        }
    }
}

// ПОКА НЕ РАЗОБРАЛСЯ ПОЧЕМУ ПРОПУСКАЕТ ПРАВИЛЬНЫЙ ВЫВОД В if
class WithIfHard {

    int inpOne, inpTwo;
//    Метод для присваивания значения полям
//для того чтобы можно во время изменения значения со строки в int брать любое имя значения,
//чтобы не было ошибки и плюс это непрямое обращения к полям
    void set(int a, int b){
        inpOne = a;
        inpTwo = b;
    }

    int sum(){
        return inpOne + inpTwo;
    }
    int proiz(){
        return inpOne * inpTwo;
    }


    public static void main(String[] args) {
        int in_a, in_b;
        String userInput;
        WithIfHard outPut = new WithIfHard();

        userInput = JOptionPane.showInputDialog("Введите число a");
        in_a = Integer.parseInt(userInput);

        userInput = JOptionPane.showInputDialog("Введите символ b");
        in_b = Integer.parseInt(userInput);

        String toDo = JOptionPane.showInputDialog("Напишите 'sum', для сложения и 'proizv' для умножения");

        outPut.set(in_a, in_b);

        if(toDo == "sum"){

            JOptionPane.showMessageDialog(null, "Сумма чисел " + in_a + " и " + in_b + " равна " + outPut.sum());

        }else if(toDo == "proizv"){

            JOptionPane.showMessageDialog(null, "Произведение чисел " + in_a + " и " + in_b + " равно " + outPut.proiz());

        }else{
            JOptionPane.showMessageDialog(null, "Произошла ошибка");
        }
    }
}

