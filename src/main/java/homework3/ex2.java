package homework3;

import java.util.*;

public class ex2 {
    public static void main(String[] ars) {
        ArrayList<Integer> arrayList = create_random_array();
        System.out.println(arrayList.toString());
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
        System.out.println(arrayList.stream().mapToInt(a -> a).average().getAsDouble());

    }

    private static ArrayList<Integer> create_random_array() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt(10));
        }
        return arrayList;
    }
}
