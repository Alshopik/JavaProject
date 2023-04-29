package seminar_04;

import java.util.Arrays;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task_01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverse(list));
    }
    
    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversList = new LinkedList<>();
        for(int i=list.size()-1; i >= 0; i--){
            reversList.add(list.get(i));
        }
        return reversList;
    }
}
