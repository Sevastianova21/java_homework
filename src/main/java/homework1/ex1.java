package homework1;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = new int[]{45, 1, 2, 8, 6, 78, 7, 5, 8, 9, 15, 10};
        int max = arr[0];
        int min = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            } else {
                if (element < min) {
                    min = element;
                }
            }
        }
        String res = "min = " + min + " max = " + max;
        System.out.println(res);
    }

}