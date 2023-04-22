package lesson_03;

import java.util.ArrayList;
import java.util.Random;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

// земля, юпитер, cатурн, земля, марс, земля, юпитер
// земля 3
// юпитер 2
// cатурн 1
// марс 1

public class task_02 {
    public static void main(String[] args) {
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        int n = 10;
        String[] planets = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        Random rnd = new Random();
        ArrayList<String> planetList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            planetList.add(planets[rnd.nextInt(planets.length)]);
        }
        System.out.println(planetList);

        long time = System.nanoTime();
        int count = 0;
        for (String elem : planets) {
            for (String elem2 : planetList) {
                ;
                if (elem.equals(elem2))
                    count++;
            }
            if (count != 0)
                System.out.printf("%s: %d \n", elem, count);
            count = 0;
        }
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time / 1_000_000.0);

        long time1 = System.nanoTime();
        int count1 = 1;
        planetList.sort(null);
        for (int i = 1; i < planetList.size(); i++) {
            if (planetList.get(i).equals(planetList.get(i - 1))) {
                count1++;
            } else {
                System.out.printf("%s: %d \n", planetList.get(i - 1), count1);
                count1 = 1;
            }
        }
        System.out.printf("%s: %d \n", planetList.get(planetList.size() - 1), count1);
        time1 = System.nanoTime() - time1;
        System.out.printf("Elapsed %,9.3f ms\n", time1 / 1_000_000.0);
    }
}
