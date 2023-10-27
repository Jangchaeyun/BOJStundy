import java.util.Scanner;

public class B15786 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            String x = scanner.next();
            boolean c = false;
            for (int j = 0, idx = 0; j < x.length(); j++) {
                if (x.charAt(j) == s.charAt(idx)) {
                    idx++;
                }
                if (idx == n) {
                    c = true;
                    break;
                }
            }
            if (c) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}