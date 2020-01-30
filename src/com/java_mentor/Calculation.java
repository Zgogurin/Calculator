package com.java_mentor;

public class Calculation {

    public static int Calc(int a, int b, String sign) {
        int result = 0;
        switch (sign) { //Ищем знак операции и вычисляем выражение
            case ("+"):
                result = a + b;
                break;
            case ("*"):
                result = a * b;
                break;
            case ("/"):
                result = a / b;
                break;
            case ("-"):
                result = a - b;
                break;
        }
        return result; //Возвращаем результат операции
    }
}
