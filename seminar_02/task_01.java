package seminar_02;
//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.io.FileWriter;

public class task_01 {
    public static void main(String[] args)  {
                
        int[] array = new int[] {6, 8, 2, 78, 96, 0};
        System.out.println(Arrays.toString(array));
        int[] newArr = bubbleSort(array);
        System.out.print("\nОтсортированный массив: \n");
        System.out.println(Arrays.toString(newArr));

    }
    public static int[] bubbleSort(int [] arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            writeLog(Arrays.toString(arr));
        }
        return arr;
    }

    private static void writeLog(String message) {
        try {
            FileWriter writer = new FileWriter("logTask_01.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в лог-файл");
        }
    }
}
