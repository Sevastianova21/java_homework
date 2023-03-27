package homework2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex2 {
    public static void main(String[] args) {
    System.out.println(create_string_test());
    write_in_file(create_string_test());
    }
    private static StringBuilder create_string_test() {
        StringBuilder string_test = new StringBuilder();
        for (int i=0; i<100; i++) {
            string_test.append("TEST").append(System.lineSeparator());
        }
        return string_test;
    }
    private static void write_in_file(StringBuilder str) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("src/main/resources/test.txt");
            pw.print(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }

    }

}
