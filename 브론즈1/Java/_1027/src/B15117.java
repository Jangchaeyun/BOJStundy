import java.util.Scanner;

public class B15117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[36][36];

        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            for (int j = 0; j < n; j++) {
                if (Character.isDigit(s.charAt(j))) {
                    board[i][j] = s.charAt(j) - '0';
                } else {
                    board[i][j] = s.charAt(j) - 'A' + 10;
                }
            }
        }

        Runnable sol = () -> {
            for (int i = 0; i < n; i++) {
                long check = 0;
                for (int j = 0; j < n; j++) {
                    check |= 1L << board[i][j];
                }
                if ((check + 1) != (1L << n)) {
                    System.out.println("No");
                    return;
                }
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i - 1][j] == board[i][j]) continue;
                    if (board[i - 1][j] < board[i][j]) break;
                    System.out.println("Not Reduced");
                    return;
                }
            }
            System.out.println("Reduced");
        };
        sol.run();
    }
}