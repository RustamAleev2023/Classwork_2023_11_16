import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    //Task1
    //Счастливое число
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число");

        int number = scanner.nextInt();

        if (String.valueOf(number).length() != 6) {
            System.out.println("Введенное число не является шестизначным");
        }
        int[] digits = new int[6];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        int leftSum = 0;
        int rightSum = 0;
        int[] left = new int[3];
        int[] right = new int[3];

        for (int i = 0; i < 3; i++) {
            left[i] = digits[i];
            right[i] = digits[digits.length - 1 - i];
            leftSum += left[i];
            rightSum += right[i];
        }

        if (leftSum == rightSum) {
            System.out.println("Вы ввели счастливое число");
        } else {
            System.out.println("Вы ввели не счастливое число");
        }
    }

    //Task2
    //В введенном шестизначном числе поменять местами 1 и 6, 2 и 5 цифры
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число");

        int number = scanner.nextInt();

        if (String.valueOf(number).length() != 6) {
            System.out.println("Введенное число не является шестизначным");
        }
        int[] digits = new int[6];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < 2; i++) {
            int temp;
            temp = digits[i];
            digits[i] = digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = temp;
        }

        StringBuilder stringBuilder = new StringBuilder(6);
        for (int i = 0; i < digits.length; i++) {
            stringBuilder.append(digits[i]);
        }
        int result = Integer.parseInt(stringBuilder.reverse().toString());

        System.out.println(result);
    }

    //Task3
    //Времена года
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца (1 - 12)");

        int num = scanner.nextInt();

        switch (num) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Autumn");
        }
    }

    //Task4
    //Месяцы
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца (1 - 12)");

        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }

    //Task5
    //Fizz-Buzz
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100");

        int number = scanner.nextInt();

        if (number % 3 == 0 && !(number % 5 == 0)) {
            System.out.println("Fizz");
        }
        if (number % 5 == 0 && !(number % 3 == 0)) {
            System.out.println("Buzz");
        }
        if (number % 15 == 0) {
            System.out.println("Fizz Buzz");
        }
    }
}
