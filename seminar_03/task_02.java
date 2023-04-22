package seminar_03;

import java.util.ArrayList;
import java.util.Arrays;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class task_02 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 5, 1, 6, 2, 7, 8, 12, 10, 41));
        System.out.println(arr);

        for (int i = arr.size()-1; i >= 0; i--){
            if (arr.get(i)%2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
