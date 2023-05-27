package lesson_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1.Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до. 100.
// 2.Создайте метод, в который передайте заполненный выше массив и с помощью Set вычеслите процент уникальных знаков
// Для вычисления процентов используйте формулу:
// процент уникальных чисел = количество уникальных числе * 100 / общее количество чисел в массиве.

public class task_02 {



    public static void main(String[] args) {
        ArrayList<Integer> dataArray = new ArrayList<>(100);
        Random rd = new Random();
        for (int i = 0; i < 99; i++) {
            dataArray.add(rd.nextInt(100));
        }
        Set<Integer> set = new HashSet<>(dataArray);
        System.out.println(set);
        System.out.println((double)set.size()*100/dataArray.size());
        System.out.printf("%.2f\n", (double)set.size()*100/dataArray.size());
    }
}
