import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23055 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        makeSiteSign(N);
    }

    private static void makeSiteSign(int N) {
        if (N == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.print("*");

                if (i == 0) {
                    for (int j = 0; j < N - 2; j++)
                        System.out.print("*");
                } else if (i == N - 1) {
                    for (int j = 0; j < N - 2; j++)
                        System.out.print("*");
                } else {
                    for (int j = 0; j < N - 2; j++) {
                        if (j == i - 1 || j == N - (i + 2)) System.out.print("*");
                        else System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
        }
    }
}