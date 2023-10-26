import java.util.Scanner;

public class B14174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[26];

        for (int k = 0; k < n; k++) {
            String[] s = new String[2];
            int[][] cnt = new int[2][26];

            for (int i = 0; i < 2; i++) {
                s[i] = scanner.next();
                for (int j = 0; j < s[i].length(); j++) {
                    cnt[i][s[i].charAt(j) - 'a']++;
                }
            }

            for (int i = 0; i < 26; i++) {
                ans[i] += Math.max(cnt[0][i], cnt[1][i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(ans[i]);
        }
    }
}