import java.util.Scanner;

public class B5103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String title = scanner.next();

            if (title.equals("#")) {
                break;
            }

            int M = scanner.nextInt();
            int S = scanner.nextInt();
            int T = scanner.nextInt();

            for (int t = 0; t < T; t++) {
                char transaction = scanner.next().charAt(0);
                int cnt = scanner.nextInt();

                if (transaction == 'S') {
                    S = Math.max(0, S - cnt);
                } else {
                    S = Math.min(M, S + cnt);
                }
            }

            System.out.println(title + " " + S);
        }

        scanner.close();
    }
}
