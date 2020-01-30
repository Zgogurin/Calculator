package com.java_mentor;

public class ArabicToRoma {

    public static String translation(int arabic) {
        int[] romanValue = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanChar = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < romanValue.length; i += 1) { //Проходим по массиву значений
            while (arabic >= romanValue[i]) { //Ищем значение в массиве меньше или равное нашему
                arabic -= romanValue[i]; //Вычитаем из числа, значение которое нашли
                result.append(romanChar[i]); //Добавляем этот символ к результату
            }
        }
        return result.toString(); //Возвращаем римское число
    }

}
