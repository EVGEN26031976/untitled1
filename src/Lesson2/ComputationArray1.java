package Lesson2;

public class ComputationArray1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = array[0];

        for (int arrayNumber : array) {
            if (arrayNumber > max) {
                max = arrayNumber;
            }
        }
        System.out.println("Максимальное число в массиве= " + max);

        int SumPositiveNumbers = 0;
        int QuantyositiveNumbers = 0;

        for (int arrayNumber : array) {
            if (arrayNumber > 0) {
                SumPositiveNumbers += arrayNumber;
                QuantyositiveNumbers++;
            }
        }
        System.out.printf("Сумма положительных чисел массива: %d%nКоличество положительных чисел массива:%d%n",
                SumPositiveNumbers, QuantyositiveNumbers);

        int negativeEvenSum = 0;
        int negativeCount = 0;
        int negativeSum = 0;

        for (int arrayNumber : array) {
            if (arrayNumber < 0) {
                negativeSum += arrayNumber;
                negativeCount++;
                if (arrayNumber % 2 == 0) {
                    negativeEvenSum += arrayNumber;
                }
            }
        }

        System.out.printf("Сумма отрицательных чисел массива:%d%nСумма четных отрицательных чисел массива:%d%nСреднее арифметическое отрицательных чисел массива%d%n",
                negativeSum, negativeEvenSum, negativeSum / negativeCount);
    }
}