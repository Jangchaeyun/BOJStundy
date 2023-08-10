import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B7601 {
    private static final int MAX = 2;

    enum Girls {
        Bec, Cas
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int day = 1; ; day++) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();

            if (n == 0 && d == 0) {
                break;
            }

            System.out.println("Scenario " + day);

            List<Integer>[] wardrobes = new ArrayList[MAX];

            for (int i = 0; i < MAX; i++) {
                wardrobes[i] = new ArrayList<>();
                for (int j = 1; j <= n; j++) {
                    wardrobes[i].add(j);
                }

                int r = scanner.nextInt();

                if (r == 0) {
                    continue;
                }

                if (i == Girls.Bec.ordinal()) {
                    wardrobes[i].remove(r - 1);
                } else {
                    wardrobes[i].remove(wardrobes[i].size() - r);
                }
            }

            int becSize = wardrobes[Girls.Bec.ordinal()].size();
            int casSize = wardrobes[Girls.Cas.ordinal()].size();

            for (int i = 1; i <= d; i++) {
                int bec = scanner.nextInt();
                int cas = scanner.nextInt();

                System.out.print("Day " + i + " ");

                if (wardrobes[Girls.Bec.ordinal()].get(bec - 1) != wardrobes[Girls.Cas.ordinal()].get(casSize - cas)) {
                    System.out.println("OK");
                } else {
                    System.out.println("ALERT");
                }
            }
        }
    }
}