package Lesson2;

import java.util.Scanner;

public class ChangedInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int integer = scanner.nextInt();

        if (integer > 0) {
            integer++;
        } else if (integer == 0) {
            integer = 10;
        } else
            integer = integer - 2;

        System.out.println("Измененное число: " + integer);
    }
}
