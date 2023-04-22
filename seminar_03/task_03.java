package seminar_03;

import java.util.ArrayList;
import java.util.Arrays;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

public class task_03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 5, 1, 6, 2, 7, 8, 12, 10, 41));
        System.out.println(arr);

        int max = arr.get(0);
        int min = arr.get(0);
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max)
                max = arr.get(i);
            if (arr.get(i) < min)
                min = arr.get(i);
            sum = sum + arr.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/arr.size()));
    }
}
