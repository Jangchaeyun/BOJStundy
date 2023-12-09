import java.util.Scanner;

public class B5426 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < T; t++) {
            String msg = scanner.nextLine();
            int n = (int) Math.sqrt(msg.length());

            StringBuilder decodeMsg = new StringBuilder();
            for (int i = n; i > 0; i--) {
                for (int j = i; j <= n * n; j += n) {
                    decodeMsg.append(msg.charAt(j - 1));
                }
            }

            System.out.println(decodeMsg);
        }
    }
}