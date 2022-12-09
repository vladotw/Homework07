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

        System.out.println("Задача_1");
        System.out.println();

        int monthlyContribution = 15_000;
        int month = 1;
        double total = 0;

        while (total <= 2_460_000 ) {

            total = total + total/100;
            total = total + monthlyContribution;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
            month = month + 1;
        }

        System.out.println();
        System.out.println("2 460 000 рублей будет накоплено через " + (month - 1) + " месяцев");

        System.out.println();
        System.out.println();
    }

    public static void task2() {

        System.out.println("Задача_2");
        System.out.println();

        int a = 0;

        while (a < 10) {
            a += 1;
            System.out.print(a + " ");
        }

        System.out.println();

        for (a = 10; a > 0 && a <= 10; a-- ) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println();
    }

    public static void task3() {

        System.out.println("Задача_3");
        System.out.println();

        int totalPopulation = 12_000_000;
        int year = 1;

        for (; year <=10; year++) {
            int birthRate = (totalPopulation * 17) / 1000;
            int mortality = (totalPopulation * 8) / 1000;
            totalPopulation = totalPopulation + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения будет составлять " +
                    totalPopulation + " человек");
        }

        System.out.println();
        System.out.println();
    }

    public static void task4() {

        System.out.println("Задача_4");
        System.out.println();

        int initialDeposit = 15_000;
        double percent = 0.07;
        double total = initialDeposit;
        int month = 0;

        System.out.println("Первоначальная сумма вклада " + initialDeposit);

        while (total <= 12_000_000) {
            total = total + (total * percent);
            String result = String.format("%.4f", total);
            month = month + 1;
            System.out.println(month + " месяц сумма накоплений составляет " + (result));
        }

        System.out.println();
        System.out.println();
    }

    public static void task5() {

        System.out.println("Задача_5");
        System.out.println();

        int initialDeposit = 15_000;
        double total = initialDeposit;
        int month = 1;

        System.out.println("Первоначальная сумма вклада " + initialDeposit);

        for (; total <= 12_000_000; month++) {
            total = total + (total * 0.07);
            String result = String.format("%.4f", total);

            if (month % 6 == 0) {
                System.out.println(month + " месяц сумма накоплений составляет " + (result));
            }
        }

        System.out.println();
        System.out.println();
    }

    public static void task6() {

        System.out.println("Задача_6");
        System.out.println();

        int initialDeposit = 15_000;
        double total = initialDeposit;
        int month = 1;
        int fullTime = 9 * 12;

        System.out.println("Первоначальная сумма вклада " + initialDeposit);

        for (; month <= fullTime; month++) {
            total = total + (total * 0.07);
            String result = String.format("%.4f", total);

            if (month % 6 == 0) {
                int period = month / 6;
                System.out.println("За " + period + " полугодие сумма накоплений составляет " + (result));
            }
        }

        System.out.println();
        System.out.println();
    }

    public static void task7() {

        System.out.println("Задача_7");
        System.out.println();

        int friday = 2;

        for (; friday <= 31; friday += 7) {

            System.out.println("Сегодня пятница, " + friday + "-е число. " +
                    "Необходимо подготовить отчёт");
        }

        System.out.println();
        System.out.println();
    }
    public static void task8() {

        System.out.println("Задача_8");
        System.out.println();



    }
}