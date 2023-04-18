package Lesson_02;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

public class task_03 {
    public static void main(String[] args) {

        System.out.println(palindrom("123321"));
        System.out.println(isPalindrom("1233521"));
    }
        
        private static boolean palindrom (String word) {
            int i1 = 0;
            int i2 = word.length()-1;
            while(i2 > i1){
                if(word.charAt(i1) != word.charAt(i2)){
                    return false;
                }
                i1++;
                i2--;
            }
            return true;
        }
        static boolean isPalindrom(String str){
            String temp = new StringBuilder(str).reverse().toString();
            return str.equals(temp);
        }
    }

