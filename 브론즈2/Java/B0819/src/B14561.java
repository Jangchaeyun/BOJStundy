import java.util.ArrayList;
import java.util.Scanner;

public class B14561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            ArrayList<Long> v = new ArrayList<>();
            boolean flag = false;

            while (true) {
                v.add(a % b);

                a /= b;
                if (a == 0) break;
            }

            int left = 0;
            int right = v.size() - 1;

            while (left <= right) {
                if (v.get(left).equals(v.get(right))) {
                    left++;
                    right--;
                } else {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}