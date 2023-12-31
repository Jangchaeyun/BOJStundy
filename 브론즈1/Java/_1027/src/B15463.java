import java.util.Scanner;

public class B15463 {
    public static void main(String[] args) {
        int[][] window = new int[2001][2001];
        Scanner scanner = new Scanner(System.in);

        for (int t = 0; t < 3; t++) {
            int a = scanner.nextInt() + 1000;
            int b = scanner.nextInt() + 1000;
            int c = scanner.nextInt() + 1000;
            int d = scanner.nextInt() + 1000;

            for (int i = a; i < c; i++) {
                for (int j = b; j < d; j++) {
                    if (t != 2){
                        window[i][j] = 1;
                    } else {
                        window[i][j] = 0;
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                ans += window[i][j];
            }
        }

        System.out.println(ans);
    }
}