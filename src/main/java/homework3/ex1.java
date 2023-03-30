package homework3;

import java.util.ArrayList;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = create_random_array();
        System.out.println(arrayList.toString());
        arrayList.removeIf(n -> (n % 2 == 0));
        System.out.println(arrayList.toString());
    }

    private static ArrayList<Integer> create_random_array() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }

}
