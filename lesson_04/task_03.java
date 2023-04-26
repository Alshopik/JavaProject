package lesson_04;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

// asd
// qwe
// zxc
// print
// zxc
// qwe
// asd

public class task_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Deque<String> list = new LinkedList<>();

        boolean stop = false;
        String line = "";
        while(!stop){
            line = sc.nextLine();
            if (line.equals("stop")) {
                stop = true;
            } else {
                if (line.equals("print")){
                    while(list.size() > 0) {
                        System.out.println(list.pop());
                    }
                } else {
                    list.push(line);
                }
            }
        }
        sc.close();   
    }
}
