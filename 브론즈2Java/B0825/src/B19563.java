import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B19563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        a = Math.abs(a);
        b = Math.abs(b);

        if (a + b <= c) {
            if ((a + b) % 2 == 0 && c % 2 == 0) System.out.println("YES");
            else if ((a + b) % 2 != 0 && c % 2 != 0) System.out.println("YES");
            else System.out.println("NO");
        } else System.out.println("NO");
    }
}
