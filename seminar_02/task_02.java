package seminar_02;

import java.io.BufferedReader;
import java.io.FileReader;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task_02 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader file = new BufferedReader(new FileReader("datdForTask_02.txt"));
            String stroka;
            while ((stroka = file.readLine()) != null) {
                String[] array = stroka.replace("\"", "").replace(":", " ").replace(",", " ").replace("  ", " ").split(" ");
                sb.append("Студент ").append(array[1]).append(" получил ").append(array[3]).append(" по предмету");
                for (int i = 5; i < array.length; i++) {
                    sb.append(" ").append(array[i]);
                }
                sb.append(".\n");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("ERROR ");
        }
        System.out.println(sb);
    }
}
