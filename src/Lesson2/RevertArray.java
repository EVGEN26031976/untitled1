package Lesson2;

import java.util.Arrays;

public class RevertArray {
    private static void revertArray(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength / 2; i++) {
            int conversionVariable = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = array[i];
            array[i] = conversionVariable;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        revertArray(array);
        System.out.println(Arrays.toString(array));
    }
}
