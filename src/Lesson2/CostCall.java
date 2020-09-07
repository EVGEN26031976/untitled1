package Lesson2;

import java.util.Scanner;

public class CostCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите код города: ");
        int codCity = scanner.nextInt();

        System.out.println("Введите количество минут разговора: ");
        int numberMinutes = scanner.nextInt();

        switch (codCity) {
            case 905 -> System.out.printf("Москва. Стоимость разговора = %.2f руб.", 4.15 * numberMinutes);
            case 194 -> System.out.printf("Ростов. Стоимость разговора = %.2f руб.", 1.98 * numberMinutes);
            case 491 -> System.out.printf("Краснодар. Стоимость разговора = %.2f руб.", 2.69 * numberMinutes);
            case 800 -> System.out.printf("Киров. Стоимость разговора = %.2f руб.", 5.00 * numberMinutes);
            default -> System.out.print("Код не найден");
        }
    }
}
