import java.util.Scanner;

public class B11104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Long result = (long) 0;
        Long cnt = (long) 1;

        for (int i = 0; i < n; i++) {
            String[] arr = scanner.next().split("");

            for (int j = 23; j >= 0; j--) {
                result += Integer.parseInt(arr[j]) * cnt;
                cnt *= 2;
            }
            System.out.println(result);
            cnt = (long) 1;
            result = (long) 0;
        }
    }
}
