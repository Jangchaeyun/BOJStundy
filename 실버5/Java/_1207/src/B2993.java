import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().trim();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length() - 2; i++) {
            for (int j = i + 1; j < word.length() - 1; j++) {
                for (int k = j + 1; k < word.length(); k++) {
                    if (word.length() == (word.substring(i, j) + word.substring(j, k) + word.substring(k)).length()) {
                        String a = word.substring(i, j);
                        String b = word.substring(j, k);
                        String c = word.substring(k);
                        list.add(reverseString(a) + reverseString(b) + reverseString(c));
                    }
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}