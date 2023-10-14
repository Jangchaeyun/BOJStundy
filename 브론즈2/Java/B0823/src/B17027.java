import java.util.Scanner;

public class B17027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[100][3];
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int result = 0;
        for (int k = 1; k <= 3; k++) {
            int now = k;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int a = arr[i][0];
                int b = arr[i][1];
                int g = arr[i][2];
                if (now == a) {
                    now = b;
                } else if (now == b) {
                    now = a;
                }

                if (now == g) {
                    cnt++;
                }
            }

            result = Math.max(result, cnt);
        }

        System.out.println(result);
    }
}