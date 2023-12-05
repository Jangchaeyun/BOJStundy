import java.util.Scanner;

public class B2545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int[] sortedABC = {a, b, c};
            java.util.Arrays.sort(sortedABC);

            a = sortedABC[0];
            b = sortedABC[1];
            c = sortedABC[2];

            int s = a + b + c - d;
            int tmp = Math.min(s / 3, a);
            int a1 = tmp;
            s -= tmp;
            tmp = Math.min(s / 2, b);
            int result = a1 * tmp * (s - tmp);

            System.out.println(result);
        }
    }
}
