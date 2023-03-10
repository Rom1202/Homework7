public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int accumulation = 0;
        int i = 0;
        while (accumulation <= 2_459_000) {
            accumulation = accumulation + accumulation / 100;
            accumulation = accumulation + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation + " рублей");
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        {
            System.out.println();
        }
        for (int y = 10; y >= 1; y--) {
            System.out.print(" " + y);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int country = 12_000_000;
        int berteRate = 17;//рождаемость
        int mortality = 8;//смертность
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = (berteRate - mortality) * country / 1000;
            country += total;
            System.out.println("Год " + i + " численость населения равна " + country);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15_000;
        for (int i = 1; contribution <= 12_000_000; i++) {
            contribution = contribution + contribution / 100 * 7;
            System.out.println("Месяц " + i + " " + contribution);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15_000;
        for (int i = 1; contribution <= 12_000_000; i++) {
            contribution = contribution + contribution / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " " + contribution);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15_000;
        int month = 12 * 9;
        for (int i = 1; i <= month; i++) {
            contribution = contribution + contribution / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " " + contribution);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int data = 5; data <= 31; data = data + 7)
            System.out.println("Сегодня пятница, " + data + "-е число. Необходимо подготовить отчет");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int comet = 0;
        for (; comet <= 2100; comet = comet + 79) {
            if (comet >= 1823) {
                System.out.println(comet);
            }
        }
    }
}






