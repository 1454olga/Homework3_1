public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 23;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }
    }

    // tack 2
    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 70;
        if (age < 2) {
            System.out.println("ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("ему пора спать");
        } else if (age > 6 && age <= 18) {
            System.out.println("ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("его место в университете");
        } else if (age > 24 && age <= 60) {
            System.out.println("ему пора ходить на работу");
        } else if (age > 60) {
            System.out.println("он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 11;
        boolean withAdult = true;
        if (age < 5) {
            System.out.println("он не может кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            if (withAdult) {
                System.out.println("он может кататься только в сопровождении взрослого");
            } else {
                System.out.println("без взрослого нельзя");
            }
        } else if (age > 14) {
            System.out.println("он может кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatPlaces = 60;
        int peapleNumber = 70;

        if (peapleNumber == capacity) {
            System.out.println("в вагоне нет мест");
        }   else if (peapleNumber < seatPlaces) {
            System.out.println("есть сидячие места");
        }   else  {
            System.out.println("есть стоячие места");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int  one = 10, two = 20, three = 30;
        if (one > two && one > three) {
            System.out.println(one);
        }   else if (two > three) {
            System.out.println(two);
        } else {
                System.out.println(three);
        }

    }
}