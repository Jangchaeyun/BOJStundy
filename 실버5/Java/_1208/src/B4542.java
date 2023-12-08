import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B4542 {

    static int N;
    static String[] s;
    static Set<String>[] st;

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        s = new String[N];
        st = new Set[N];

        for (int k = 0; k < N; k++) {
            s[k] = scanner.next();
            st[k] = new HashSet<>();
        }

        for (int len = 60; len > 2; len--) {
            for (int k = 0; k < N; k++) st[k].clear();

            for (int i = 0; i <= 60 - len; i++) {
                for (int k = 0; k < N; k++) {
                    st[k].add(s[k].substring(i, i + len));
                }
            }

            for (String cur : st[0]) {
                boolean chk = true;

                for (int k = 1; k < N; k++) {
                    if (!st[k].contains(cur)) {
                        chk = false;
                        break;
                    }
                }

                if (chk) {
                    System.out.println(cur);
                    return;
                }
            }
        }

        System.out.println("no significant commonalities");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
