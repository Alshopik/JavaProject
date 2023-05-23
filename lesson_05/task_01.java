package task_01;

import java.io.Serial;
import java.util.HashMap;

public class task_01 {
/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.*/

public static void main(String[] args){
    HashMap <Integer, String> Workers = new HashMap<>();
    Workers.put(123456, "Иванов");
    Workers.put(321456, "Васильев");
    Workers.put(234561, "Петрова");
    Workers.put(23432, "Иванов");
    Workers.put(345678, "Иванов");

    for(var currWorker: Workers.entrySet()){//Можно также идти только по ключам или по значениям
    //for(int currWorker: Workers.keySet()){ //по ключу
    //for(int currWorker: Workers.valueSet()){//по значению   
        if(currWorker.getValue().equals("Иванов")) {
            System.out.println(currWorker);
        }
    }

    }  
}