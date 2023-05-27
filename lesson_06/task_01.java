package lesson_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class task_01 {

    // 1. Создайте HashSet, заполните его следующими значениями: {1, 2, 30000, 2, 4, 5000, 6 }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6));
        // set.add(1); 
        // set.add(2);
        // set.add(30000);
        // set.add(2);
        // set.add(4);
        // set.add(5000);
        // set.add(6);
        System.out.println(set);

        LinkedHashSet<Integer> l_set = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6)); // выводит в порядке заполнения
        System.out.println(l_set);
        TreeSet<Integer> t_set = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6)); // сортирует в порядке возрастания
        System.out.println(t_set);
    }
}
