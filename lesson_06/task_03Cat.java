package lesson_06;

public class task_03Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Барсик";
        cat.birhtyear = 2020;
        cat.gender = true;
        cat.vendor_phone ="123456";

        cat.visit("21042023", "Поставили привику");
        cat.visit("21052023", "Все нормально, кот здоров!");

        cat.printVisit();
        cat.miay();
        System.out.printf("коту %s года\n", cat.age());

    }
}
