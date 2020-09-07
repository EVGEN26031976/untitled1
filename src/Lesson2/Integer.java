package Lesson2;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int integer = scanner.nextInt();

        int lastDigit = integer % 10;
        System.out.println("Последняя цифра введенного числа: " + lastDigit);
    }
}
