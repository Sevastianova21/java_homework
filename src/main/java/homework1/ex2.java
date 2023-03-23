package homework1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(visocosny_true_or_false());
    }

    private static boolean visocosny_true_or_false() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите год ");
        int year = iScanner.nextInt();
        boolean vis = false;
        if (year % 4 == 0 && year % 100 != 0) {
            vis = true;
        } else {
            if (year % 400 == 0) {
                vis = true;
            }
        }
        return vis;
    }
}
