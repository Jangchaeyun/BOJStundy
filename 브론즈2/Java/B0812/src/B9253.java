import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9253 {
    static String pattern;
    static int[] pi;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        pattern = br.readLine();
        getPi();

        if (kmp(str1) && kmp(str2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean kmp(String str) {
        char[] s = str.toCharArray();
        char[] p = pattern.toCharArray();

        int j = 0;
        for (int i = 0; i < s.length; i++) {
            while (j > 0 && s[i] != p[j]) {
                j = pi[j - 1];
            }

            if (s[i] == p[j]) {
                if (j == p.length - 1) {
                    return true;
                }
                else
                    j++;
            }
        }

        return false;
    }

    public static int[] getPi() {
        char[] p = pattern.toCharArray();
        pi = new int[p.length];
        int j = 0;

        for (int i = 1; i < p.length; i++) {
            while (j > 0 && p[i] != p[j]) {
                j = pi[j - 1];
            }

            if (p[i] == p[j]) {
                pi[i] = ++j;
            }
        }
        return pi;
    }
 }
