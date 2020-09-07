package Lesson2;

import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int integer = scanner.nextInt();

        if (integer >= 0) {
            integer++;
        }

        System.out.println("Проверенное число: " + integer);
    }
}
