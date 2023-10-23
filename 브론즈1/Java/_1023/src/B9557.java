import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B9557 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int index = -1;
            List<String> words = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                String input = scanner.next();
                words.add(input);

                if (input.charAt(0) >= 'a' && input.charAt(0) <= 'z') {
                    index = j;
                }
            }

            if (index != -1) {
                for (int j = index + 1; j < words.size(); j++) {
                    System.out.print(words.get(j) + " ");
                }
                System.out.print(words.get(index) + " ");
                for (int j = 0; j < index; j++) {
                    System.out.print(words.get(j) + " ");
                }
                System.out.println();
            } else {
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
        }
    }
}