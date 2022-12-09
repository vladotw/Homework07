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


        System.out.println();
        System.out.println();
    }

    public static void task4() {

        System.out.println("Задача_4");
        System.out.println();


        System.out.println();
        System.out.println();
    }

    public static void task5() {

        System.out.println("Задача_5");
        System.out.println();


        System.out.println();
        System.out.println();
    }

    public static void task6() {

        System.out.println("Задача_6");
        System.out.println();


        System.out.println();
        System.out.println();
    }

    public static void task7() {

        System.out.println("Задача_7");
        System.out.println();


        System.out.println();
        System.out.println();
    }
    public static void task8() {

        System.out.println("Задача_8");
        System.out.println();



    }
}