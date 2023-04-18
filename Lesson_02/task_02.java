package Lesson_02;

// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcddaaa.
// a4b3cd2a3

public class task_02 {

    private static String extracted(String start) {
        StringBuilder result = new StringBuilder();
        result.append(start.charAt(0));
        int count = 1;
        for (int i = 1; i < start.length(); i++){
            if (start.charAt(i) == start.charAt(i-1)){
                count++;
            }
            else{
                if (count !=1) result.append(count);
                count = 1;
                result.append(start.charAt(i));
            }
        }
        if (count != 1) result.append(count);
        return result.toString();
    }
    public static void main(String[] args) {

        System.out.print(extracted("aaaabbbcddaaa"));
    }

    
}
