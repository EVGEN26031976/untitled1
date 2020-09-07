package Lesson2;

import java.util.Scanner;

public class ComparisonNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondInteger = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int thirdInteger = scanner.nextInt();

        if (firstInteger < secondInteger && firstInteger < thirdInteger) {
            System.out.println("Наименьшее число: " + firstInteger);
        } else if (secondInteger < thirdInteger && secondInteger < firstInteger) {
            System.out.println("Наименьшее число: " + secondInteger);
        } else

            System.out.println("Наименьшее число: " + thirdInteger);
    }
}
