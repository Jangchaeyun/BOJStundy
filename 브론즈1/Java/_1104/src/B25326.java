import java.util.Scanner;

public class B25326 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[][] lst = new String[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                lst[i][j] = scanner.next();
            }
        }

        for (int k = 0; k < m; k++) {
            String[] sfc = new String[3];
            for (int j = 0; j < 3; j++) {
                sfc[j] = scanner.next();
            }

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int check = 0;
                for (int j = 0; j < 3; j++) {
                    if (sfc[j].equals("-")) {
                        check++;
                        continue;
                    }
                    if (sfc[j].equals(lst[i][j])) {
                        check++;
                    }
                }
                if (check == 3) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}