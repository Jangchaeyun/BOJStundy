import java.util.Arrays;
import java.util.Scanner;

public class B6367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] li = new int[16][3];

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 3; j++) {

                li[i][j] = scanner.nextInt();
            }
        }

        while (true) {
            int R = scanner.nextInt();
            int G = scanner.nextInt();
            int B = scanner.nextInt();

            if (R == -1 && G == -1 && B == -1) {
                break;
            }

            Arrays.sort(li, (a, b) -> {
                double distA = Math.pow(R - a[0], 2) + Math.pow(G - a[1], 2) + Math.pow(B - a[2], 2);
                double distB = Math.pow(R - b[0], 2) + Math.pow(G - b[1], 2) + Math.pow(B - b[2], 2);
                return Double.compare(distA, distB);
            });

            System.out.print("(");
            System.out.print(R + "," + G + "," + B + ") maps to (");
            System.out.print(li[0][0] + "," + li[0][1] + "," + li[0][2] + ")\n");
        }
    }
}