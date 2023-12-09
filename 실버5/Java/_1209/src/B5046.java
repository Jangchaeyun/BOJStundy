import java.util.Scanner;

public class B5046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        int[] cost = new int[H];
        int[][] hotel = new int[H][W];
        int[] total = new int[H];

        for (int i = 0; i < H; i++) {
            cost[i] = scanner.nextInt();
            for (int j = 0; j < W; j++) {
                hotel[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (hotel[i][j] >= N) {
                    total[i] = N * cost[i];
                    break;
                }
            }
        }

        int minTotal = Integer.MAX_VALUE;
        for (int i = 0; i < H; i++) {
            if (total[i] > 0 && total[i] < minTotal) {
                minTotal = total[i];
            }
        }

        if (minTotal == Integer.MAX_VALUE || minTotal > B) {
            System.out.println("stay home");
        } else {
            System.out.println(minTotal);
        }
    }
}