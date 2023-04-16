package seminar_01;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int triangularNumber = (n * (n + 1)) / 2;
        System.out.print("Треугольное число (сумма чисел от 1 до n) = ");
        System.out.print(triangularNumber);
        System.out.println();

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("Факториал! (произведение чисел от 1 до n) = ");
        System.out.print(fact);
    }
}
