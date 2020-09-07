package Lesson2;

import java.util.Scanner;

public class DescriptionTypeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.print("Нулевое число");
            return;
        } else if (number < 0) {
            System.out.print("Отрицательное ");
        } else
            System.out.print("Положительное ");


        if (number % 2 == 0) {
            System.out.print("чётное число");
        } else
            System.out.print("нечётное число");
    }
}
