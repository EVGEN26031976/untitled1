package Lesson2;

import java.util.Scanner;

public class SumThreeDigitInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое трехзначное число: ");
        int integer = scanner.nextInt();

        int lastDigit = integer % 10;
        int secondDigit = integer / 10 % 10;
        int firstDigit = integer / 100;
        System.out.println("Сумма цифр введенного числа: " + (lastDigit + secondDigit + firstDigit));
    }
}
