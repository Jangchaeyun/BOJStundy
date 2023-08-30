import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B28062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] candy = new int[N];
        for (int i = 0; i < N; i++) {
            candy[i] = scanner.nextInt();
        }

        int result = 0;
        ArrayList<Integer> oddCandy = new ArrayList<>();

        for (int i : candy) {
            if (i % 2 == 1) {
                oddCandy.add(i);
            } else {
                result += i;
            }
        }

        if (oddCandy.size() % 2 == 1) {
            Collections.sort(oddCandy, Collections.reverseOrder());
            oddCandy.remove(oddCandy.size() - 1);
            for (int odd : oddCandy) {
                result += odd;
            }
        } else {
            for (int odd : oddCandy) {
                result += odd;
            }
        }

        System.out.println(result);
    }
}