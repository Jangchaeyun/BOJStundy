import java.util.Scanner;

public class B6139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 0; i < K; i++) {
            int S = scanner.nextInt();
            int T = scanner.nextInt();
            int R = scanner.nextInt();

            int oneRep = S * T;
            int result = 0;
            int repCnt = 0;

            while (true) {
                if (N - repCnt <= oneRep) {
                    result += Math.ceil((double) (N - repCnt) / S);
                    break;
                }

                repCnt += oneRep;
                result += T + R;
            }

            System.out.println(result);
        }
        scanner.close();
    }
}