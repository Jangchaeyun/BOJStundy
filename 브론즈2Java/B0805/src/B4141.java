import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4141 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        for (int tc = 0; tc < N; ++tc) {
            StringBuilder sb = new StringBuilder(in.readLine().toUpperCase());
            for (int i = 0; i < sb.length(); ++i) {
                char ch = sb.charAt(i);
                if (ch <= 'C') sb.setCharAt(i, '2');
                else if (ch <= 'F') sb.setCharAt(i, '3');
                else if (ch <= 'I') sb.setCharAt(i, '4');
                else if (ch <= 'L') sb.setCharAt(i, '5');
                else if (ch <= 'O') sb.setCharAt(i, '6');
                else if (ch <= 'S') sb.setCharAt(i, '7');
                else if (ch <= 'V') sb.setCharAt(i, '8');
                else sb.setCharAt(i, '9');
            }

            if (sb.toString().equals(new StringBuilder(sb).reverse().toString())) out.append("YES\n");
            else out.append("NO\n");
        }
        System.out.println(out);
    }
}
