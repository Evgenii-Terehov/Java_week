package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {}

class Sort {

    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String string;
        System.out.print("Введите строку: ");
        string = buffer.readLine();

        string = Sort.cleanedLine(string);
        Sort.sortMas(string);
    }

    public static String cleanedLine(String line) {

        line = line.replaceAll("\\p{Punct}", "");     //убираем все знаки пунктуации (работает как для русского так и для англ языка)
//        line = line.replaceAll("[0-9]", "");          //убираем числа в строке, если таковые есть
        return line;
    }

    public static void sortMas(String line) {
        ArrayList<String> alphabet = new ArrayList<String>();         //используем список для хранения символов строки

        String[] mas = line.split(" ");
        for(int i = 0; i < mas.length; ++i)
            alphabet.add(mas[i]);                                     //заполняем список символами из строки

        Collections.sort(alphabet);                                   //сортируем в алфавитном порядке

        System.out.print("Отсортированный массив:\n");
        for(String str : alphabet)                                    //перебираем в цикле
            System.out.println(str);                                  //выводим
    }
}
