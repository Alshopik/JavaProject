package Lesson_02;

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
// 6
// a b
// ababab

public class task_01 {
    public static void main(String[] args) {
        int N = 20;
        String c1 = "a";
        String c2 = "b";
        extracted(N, c1, c2);
    }

    private static void extracted(int N, String c1, String c2) {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < N; i++){
            result.append(c1 + c2);
        }
        System.out.print(N);
        System.out.println();
        System.out.printf(c1);
        System.out.printf(c2); 
        System.out.println();
        System.out.printf("%s\n", result.toString());
    }
}
