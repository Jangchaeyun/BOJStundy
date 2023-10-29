import java.util.Scanner;

public class B17288 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));

        int cnt = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i) - 1) {
                ans.append(s.charAt(i));
            } else {
                if (ans.length() == 3) {
                    cnt++;
                }
                ans.setLength(0);
                ans.append(s.charAt(i));
            }
        }

        System.out.println(cnt);
    }
}