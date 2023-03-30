package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex3 {
    public static void main(String[] ars) {

        ArrayList <String> smth = create_list();
        System.out.println(smth);
        System.out.println(delete_integer(smth));


    }

    public static ArrayList<String> create_list() {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto", "1", "2", "3", "4");
        ArrayList <String> smth = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            smth.add(names.get(random.nextInt(names.size())));
        }
        return smth;
    }
    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static ArrayList<String> delete_integer(ArrayList <String> smth){

        for (int i = 0;i < smth.size();i++   ) {
            if (isNumeric(smth.get(i))) {
                smth.remove(i);
            }
        }
        return smth;
    }
}
