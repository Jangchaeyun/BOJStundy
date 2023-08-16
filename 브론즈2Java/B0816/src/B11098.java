import java.util.Scanner;

public class B11098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            int maxPrice = 0;
            String maxName = "";

            for (int j = 0; j < p; j++) {
                int c = scanner.nextInt();
                String name = scanner.next();

                if (c > maxPrice) {
                    maxPrice = c;
                    maxName = name;
                }
            }

            System.out.println(maxName);
        }
    }
}