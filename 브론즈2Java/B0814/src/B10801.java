import java.util.Scanner;

public class B10801 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int aWin = 0, bWin = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; ++i) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; ++i) {
            if (A[i] > B[i]) {
                aWin++;
            } else if (A[i] < B[i]) {
                bWin++;
            }
        }

        if (aWin > bWin) {
            System.out.println("A");
        } else if (aWin < bWin) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }

        scanner.close();
    }
}