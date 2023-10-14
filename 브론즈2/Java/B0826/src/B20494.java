import java.util.Scanner;

public class B20494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += scanner.nextLine().length();
        }

        System.out.println(cnt);
    }
}
