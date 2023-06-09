package seminar_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class task_01{
    public static void main(String[] args) {
        HashMap <String, ArrayList<Integer>> book = new HashMap<>();
        Scanner sc = new Scanner(System.in, "Cp866");
        while (true){
            System.out.println("Введите 1 - чтобы добавить номер, 2 - чтобы вывести все записи, 3 - чтобы завершить");
            int com = sc.nextInt();
            sc.nextLine();
            if (com==1){
                addPhoneNumber(book,sc);
            }
            if (com==2){
                printall(book);
            }
            if (com==3){
                break;
            }
        }
        sc.close();
    }
    public static void addPhoneNumber(HashMap <String, ArrayList<Integer>> phoneBook, Scanner sc){
        System.out.println("Введите фамилию: ");
        String name = sc.nextLine();
        System.out.println("Введите номер телефона: ");
        int num = sc.nextInt();
        if(!phoneBook.containsKey(name)){
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(num);
        }
    public static void printall(HashMap <String, ArrayList<Integer>> book){
        book.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString().replaceAll("\\[", "").replaceAll("\\]",""));
        });
    }
    }