package seminar_01;

// Вывести все простые числа от 1 до 1000
public class task_02 {
    public static void main(String[] args) {
        int n = 1000;
        
        for (int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
    }
}
