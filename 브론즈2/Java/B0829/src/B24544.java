import java.util.Scanner;

public class B24544 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] view = new int[N];
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            view[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        int res = 0;

        for (int i = 0; i < N; i++) {
            if (score[i] == 0) {
                res += view[i];
            }
        }

        int sumView = 0;
        for (int i = 0; i < N; i++) {
            sumView += view[i];
        }

        System.out.println(sumView);
        System.out.println(res);
    }
}