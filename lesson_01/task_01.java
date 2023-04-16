package lesson_01;

import java.util.Random;

public class task_01 {
    public static void main(String[] args) {
        clearScreen();
        // Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1, 1], вывести максимальное количесвто подряд идущих 1.
        Random item = new Random();
        // int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 1 };
        int[] arr = new int[item.nextInt(10, 15)];
        System.out.print("arr = ");

        for (int i = 0; i < arr.length; i++){
            arr[i] = item.nextInt(0,2);
            System.out.printf("%d ", arr[i]);
        }
        int currCount = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                currCount ++;
            }
            else {
                if (maxCount < currCount){
                    maxCount = currCount;
                }
                currCount = 0;
            }
        }
        System.out.printf("maxCount = %d \n", maxCount);
    }


    /*
     * Метод очистки консоли терминала
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}