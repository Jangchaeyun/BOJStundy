import java.util.Arrays;
import java.util.Scanner;

public class B9047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            int ans = 0;
            String S = scanner.nextLine();

            while (!S.equals("6174")) {
                int s_bigger = Integer.parseInt(sortAndReverse(S));
                int s_smaller = Integer.parseInt(sortString(S));
                S = String.valueOf(s_bigger - s_smaller);

                if (S.length() < 4) {
                    StringBuilder temp = new StringBuilder();
                    for (int j = 0; j < 4 - S.length(); j++) {
                        temp.append('0');
                    }
                    S = temp.toString() + S;
                }

                ans++;
            }

            System.out.println(ans);
        }

        scanner.close();
    }

    private static String sortAndReverse(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }

    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}