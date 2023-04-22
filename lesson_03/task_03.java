package lesson_03;

import java.util.ArrayList;
import java.util.Arrays;

// Создать ArrayList. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

public class task_03 {
    public static void main(String[] args) {
        
        ArrayList<Object> arr = new ArrayList<>(Arrays.asList( 0, "sss", 1, "ddd", 2, "kkk"));
        System.out.println(arr);

        for (int i = arr.size()-1; i >= 0; i--){
            if (arr.get(i) instanceof Integer){
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
