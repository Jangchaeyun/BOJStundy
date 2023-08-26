import java.util.Arrays;
import java.util.Scanner;

public class B20155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] cnt = new int[Arrays.stream(arr).max().getAsInt() + 1];
        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++;
        }

        int maxCount = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCount) {
                maxCount = cnt[i];
            }
        }

        System.out.println(maxCount);
    }
}
