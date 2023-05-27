package lesson_06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Продумайте структуру класса КОТ. Какие поля и методы будут актуальны для приложения, 
// которое является информационной системой ветеринарной клиники

// Поля: 
    // Integer birhtday - возрвст;
    // String name - кличка;
    // Boolean gender - пол;
    // String vendor_phone - телефон владельца;

    // Методы:
    // miay - кот "name" мяукнул 5 раз

public class Cat {
    Integer birhtyear;
    String name;
    Boolean gender;
    String vendor_phone;

    // Set<String> visits = new HashSet<>(); // Журнал посещений
    // ArrayList<ArrayList<String>> visit = new ArrayList<>();
    HashMap<String, String> visits = new HashMap<>(); // Журнал посещений
    

    public void visit(String visit_data, String visit_resuit) {
        this.visits.put(visit_data, visit_resuit);
    }
    public void miay() {
        System.out.printf("кот %s мяукнул 5 раз\n", this.name);
    }

    public int age() {
        LocalDate today = LocalDate.now();
        return today.getYear() - this.birhtyear;
    }

    public void printVisit() {
        System.out.println(this.visits);
    }
}
