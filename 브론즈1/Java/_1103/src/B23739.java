import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B23739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int sum = 0;
        List<Integer> v = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            v.add(value);
            if ((value + 1) / 2 <= 30 - sum) {
                ans++;
            }
            sum += value;
            if (sum >= 30) {
                sum = 0;
            }
        }

        System.out.println(ans);
    }
}