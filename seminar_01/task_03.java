package seminar_01;
// 3. Реализовать простой калькулятор

// Введите первое число: 12
// Введите операцию: +
// Введите второе число: 1
// Ответ: 13

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double number1 = iScanner.nextDouble();

        System.out.print("Введите операцию +, -, *, /: ");
        char operator = iScanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double number2 = iScanner.nextDouble();
        iScanner.close();

        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }
        //System.out.printf("Ответ: %s\n", result);
        System.out.print("\nОтвет:\n");
        System.out.printf(number1 + " " + operator + " " + number2 + " = " + result);
    }
}
