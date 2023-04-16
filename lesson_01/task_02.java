package lesson_01;

import java.util.Arrays;

public class task_02 {
// Дан массив nums = [3,2,4,3,2,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// Не создаём доп.массив

// [2,4,2,5,3,3,3]
    public static void main(String[] args) {
        int[] arr = new int[] { 3,2,4,3,2,5,3 };
        int val = 3;

        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] == val) {
            arr[j] = arr[j + 1];
            arr[j + 1] = val;
            }
            }
            }
            
            System.out.println(Arrays.toString(arr));
    }

    // int [] arr = new int[]{1,3,3,2,4,3,5,3,3}; //1 2 4 5 3,3,3,3,3
    // int val = 3;
    // int count = 0;

    // for (int i = 0; i < arr.length; i++)
    // if (arr[i] != val) {
    // arr[count++] = arr[i];
    // }
    // while (count < arr.length)
    // arr[count++] = val;
    // for (int i : arr) {
    // System.out.println(i);

}
