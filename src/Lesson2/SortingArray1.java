package Lesson2;

import java.util.Arrays;

public class SortingArray1 {
    public static void main(String[] args) {
        int[] array = new int[]{15, 10, 0, -6, -5, 3, 0, 32, 56, 0, 24, -52};
        int temp = 0;
        int lastIndex = array.length - 1;

        for (int i = lastIndex - 1; i >= 0; i--) {

            if (array[i] == 0) {
                array[i] = array[lastIndex - temp];
                array[lastIndex - temp] = 0;
                temp++;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
