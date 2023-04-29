package seminar_04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        Deque<Double> number_list = new LinkedList<>();
        
        boolean first_input = true;
        boolean calc = true;
        double number1 = 0.0;
        String operationation;

        while (calc) {
            if (first_input) {
                number1 = input_number(sc);
                first_input = false;
            }
            operationation = input_operationation(sc);
            if (operationation.equals("отмена")) {
                if (!number_list.isEmpty()) {
                    reset_operationation(number_list);
                    number1 = number_list.getLast();
                } else {
                    System.out.println("Текущий результат отсутствует. Давайте начнем сначала!");
                    number1 = input_number(sc);
                }
                operationation = input_operationation(sc);
            }
            double number2 = input_number(sc);
            double result = calculation(number1, number2, operationation);
            number1 = result;
            add_element(number_list, result);
            System.out.println("Результат = " + result);
        }
    }
    // Метод ввода числа
    public static double input_number(Scanner scanner) {
        System.out.println("Введите число");
        double number = 0.0;
        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели не число. Попробуйте еще раз");
            input_number(scanner);
        }
        return number;
    }

    // Метод ввода оператора действия
    public static String input_operationation(Scanner scanner) {
        System.out.println("Введите оператор действия (+, -, *, /) или 'Отмена'");
        String operation = scanner.next().toLowerCase();
        if ((!operation.equals("+")) & (!operation.equals("-")) & (!operation.equals("*")) & (!operation
                    .equals("/")) & (!operation.equals("отмена"))) {
                System.out.println("Неправильная операция. Попробуйте снова!");
                operation = input_operationation(scanner);
                scanner.nextLine();
        }
        return operation;
    }

    // Метод отмены последнего действия
    public static void reset_operationation(Deque<Double> list) {
        if (!list.isEmpty()) {
            list.removeLast();
            System.out.println("Операция отменена");
            if (list.isEmpty()) {
                list.addLast(0.0);
            }
            System.out.println("Предыдущий результ " + list.getLast());
        }
    }

    // Калькулятор
    public static double calculation(double num1, double num2, String operation) {
        double result = 0.0;
        switch (operation.toLowerCase()) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }

    // Метод добавления элементов в очередь
    public static void add_element(Deque<Double> list, double element) {
        list.addLast(element);
    }
}
