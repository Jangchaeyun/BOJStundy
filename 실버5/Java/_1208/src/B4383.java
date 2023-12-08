import java.util.Scanner;

public class B4383 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            int[] arr = new int[3000];
            if (n == 1) {
                int a = scanner.nextInt();
                System.out.println("Jolly");
            } else {
                int[] cnt = new int[3000];

                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                    if (i == 0) {
                        continue;
                    }
                    int num = arr[i] - arr[i - 1];
                    if (num > 0) {
                        cnt[num]++;
                    } else {
                        cnt[num * (-1)]++;
                    }
                }

                boolean isJolly = true;
                for (int i = 1; i < n; i++) {
                    if (cnt[i] == 0) {
                        System.out.println("Not jolly");
                        isJolly = false;
                        break;
                    }
                }

                if (isJolly) {
                    System.out.println("Jolly");
                }
            }

            if (!scanner.hasNextInt()) {
                break;
            }
        }
    }
}