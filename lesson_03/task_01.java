package lesson_03;

import java.util.ArrayList;
import java.util.Random;

// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

public class task_01 {
    public static void main(String[] args) {
        int n = 10;
        Random rd = new Random(0);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(80, 100));
        }
        System.out.println(arr);
        arr.sort(null);
        System.out.println(arr);
    }

}
