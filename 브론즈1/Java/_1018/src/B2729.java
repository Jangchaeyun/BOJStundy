import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class B2729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String a1 = st.nextToken();
            String b1 = st.nextToken();

            BigInteger a2 = new BigInteger(a1, 2);
            BigInteger b2 = new BigInteger(b1, 2);

            BigInteger ans = a2.add(b2);
            sb.append(ans.toString(2) + "\n");
        }

        System.out.println(sb.toString());
    }
}