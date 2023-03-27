package homework2;

public class ex1 {
    public static void main(String[] args) {
        String phrase = "арозаупаланалапуазора";
        System.out.println(check_string(phrase));
    }

    private static boolean check_string(String phrase) {
        boolean flag = true;
        char[] letters = phrase.toCharArray();
        for (int i = 0; i <= ((letters.length - 1) / 2); i++) {
            if (letters[i] != letters[letters.length - 1 - i]) {
                flag = false;
                i = letters.length;
            }
        }
        return flag;
    }
}