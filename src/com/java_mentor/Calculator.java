package com.java_mentor;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        String[] operation = {"+", "*", "/", "-"}; //Массив операций которые нам доступны
        Map<String, String> numerals = new HashMap<String, String>( //Для удобного перевода из римских в арабские
                Map.of("I", "1", "II", "2", "III", "3", "IV", "4",
                        "V", "5", "VI", "6", "VII", "7",
                        "VIII", "8", "IX", "9", "X", "10"));
        String expression = scanner.nextLine(); //Получаем выражение
        String[] expressionParse = expression.split(" "); //Разделяем строку по пробелам
        if (expressionParse.length == 3) { //Проверяем распарсенную строку на количество элементов
            if (numerals.containsKey(expressionParse[0]) && numerals.containsKey(expressionParse[2]) && Arrays.asList(operation).contains(expressionParse[1])) { //Если это римские цифры и знак операции который нам подходит
                result = ArabicToRoma.translation(Calculation.Calc(Integer.valueOf(numerals.get(expressionParse[0])), Integer.valueOf(numerals.get(expressionParse[2])), expressionParse[1]));
                System.out.println(result);
            }
            if (numerals.containsValue(expressionParse[0]) && numerals.containsValue(expressionParse[2]) && Arrays.asList(operation).contains(expressionParse[1])) { //Если это арабские цифры и знак операции который нам подходит
                result = String.valueOf(Calculation.Calc(Integer.valueOf(expressionParse[0]), Integer.valueOf(expressionParse[2]), expressionParse[1]));
                System.out.println(result);
            }
        }
        if (result == "") //Если введено неверное выражение, строка останется пустая как при инициализации
            System.out.println("Вы ввели неправильное выражение");
    }
}
