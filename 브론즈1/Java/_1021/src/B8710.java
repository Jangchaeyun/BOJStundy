import java.util.Scanner;

public class B8710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int ma = 0;
        int mi = (int) 1e9;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = scanner.nextInt();
            mi = Math.min(mi, currentNumber);
            if(ma < currentNumber) {
                ma = currentNumber;
                mi = currentNumber;
            }
            ans = Math.max(ma - mi, ans);
        }

        System.out.println(ans);
        scanner.close();
    }
}
