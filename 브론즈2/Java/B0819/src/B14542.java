import java.util.Scanner;

public class B14542 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = 1;

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            int[][] li = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    li[i][j] = scanner.nextInt();
                }
            }

            int res = li[0][0] + sum(li[n - 1]);
            if (n > 1) {
                res += sum(li[0]) + sum(li[n - 1]);
            }

            for (int i = 1; i < n - 1; i++) {
                res += li[i][0] + li[i][n - 1];
            }

            System.out.println("Case #" + caseNum + ": " + res);
            caseNum++;
        }
    }

    static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}