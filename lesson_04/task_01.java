package lesson_04;

import java.util.ArrayList;
import java.util.LinkedList;

// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

public class task_01 {
    public static void main(String[] args) {
        long starTime1 = System.currentTimeMillis();
        ArrayList <Integer> arr1 = new ArrayList<>();
        Integer arrSize = 100000;
        for (int i = 0; i < arrSize; i++){
            arr1.add(i);
        }
        long endTime1 = System.currentTimeMillis() - starTime1;
        long starTime2 = System.currentTimeMillis();
        LinkedList <Integer> arr2 = new LinkedList<>();
        
        for (int i = 0; i < arrSize; i++){
            arr2.add(i);
        }
        long endTime2 = System.currentTimeMillis() - starTime2;

        System.out.println("Время выполнения через ArrayList = " + endTime1);
        System.out.println("Время выполнения через LinkedList = " + endTime2);
    }
}
