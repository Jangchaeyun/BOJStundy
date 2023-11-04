import java.util.Scanner;

public class B25643 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }

        for (int i = 0; i < n - 1; i++) {
            String str1 = str[i];
            String str2 = str[i + 1];

            boolean isAble = false;

            for (int j = 1; j <= m; j++) {
                if (str1.substring(m - j).equals(str2.substring(0, j)) || str1.substring(0, j).equals(str2.substring(m - j))) {
                    isAble = true;
                    break;
                }
            }

            if (!isAble) {
                System.out.println(0);
                System.exit(0);
            }
        }

        System.out.println(1);
    }
}