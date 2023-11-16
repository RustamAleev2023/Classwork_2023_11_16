import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
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

        if(leftSum == rightSum) {
            System.out.println("Вы ввели счастливое число");
        } else {
            System.out.println("Вы ввели не счастливое число");
        }
    }

    //Task2
    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число");


    }
}
