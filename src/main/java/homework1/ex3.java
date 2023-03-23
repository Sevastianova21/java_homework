package homework1;

import java.util.Arrays;

public class ex3 {
    public static void reorder(int[] numbers, int val) {
        int k = 0;
        for (int element : numbers) {
            if (element != val) {
                numbers[k++] = element;
            }
        }

        for (int i = k; i < numbers.length; i++) {
            numbers[i] = val;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {7, 7, 7, 2, 3, 0, 5, 3, 4};

        reorder(numbers, 7);
        System.out.println(Arrays.toString(numbers));
    }
}

