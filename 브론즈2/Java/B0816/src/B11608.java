import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B11608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] alpha = new int[26];
        int cnt = 0, ans = 0;
        List<Integer> v = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (alpha[i] > 0) {
                v.add(alpha[i]);
                cnt++;
            }
        }

        Collections.sort(v);

        for (int i = 0; i < cnt - 2; i++) {
            ans += v.get(i);
        }

        System.out.println(ans);
    }
}